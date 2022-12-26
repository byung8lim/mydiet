package com.byung8.mydiet.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byung8.common.domain.Result;
import com.byung8.common.exception.Byung8Exception;
import com.byung8.mydiet.domain.ExerciseParam;
import com.byung8.mydiet.mapper.ExerciseParamMapper;

import lombok.extern.slf4j.Slf4j;

@Service("exerciseService")
@Slf4j
public class ExerciseServiceImpl implements ExerciseService {
	@Autowired
	private ExerciseParamMapper excParamMapper;
	
	@Override
	public Result calculateCalorie(String paramId, float weight, int excAmt, String txid) throws Byung8Exception {
		Result result = null;
		try {
			ExerciseParam param = excParamMapper.findExerciseParamById(paramId);
			//MET * (3.5 * 몸무게 * 시간(분)) * 5 /1000
			float cal = (param.getParamVal() * (float)3.5 * (float)weight * (float) excAmt * (float)5.0)/1000;
			result = new Result(txid, Result.OK).putValue("calorie", cal);
		} catch(SQLException e) {
			log.error("calorie", e);
			throw new Byung8Exception(e);
		}
		return result;
	}

	@Override
	public Result registerExercseParam(ExerciseParam exerciseParam, String txid) throws Byung8Exception {
		Result result = null;
		try {
			int cnt = excParamMapper.registerExerciseParam(exerciseParam);
			boolean res = cnt > 0 ? true:false;
			result = new Result(txid, Result.OK).putValue("result", res);
		} catch(SQLException e) {
			log.error("findCodes", e);
			throw new Byung8Exception(e);
		}
		return result;
	}
	
	@Override
	public Result getExcParams(String paramName, String txid) throws Byung8Exception {
		Result result = null;
		try {
			List<ExerciseParam> list = null;
			if ("all".equalsIgnoreCase(paramName)) {
				list = excParamMapper.findExerciseAll();
			} else{
				list = excParamMapper.findExerciseParamsByName(paramName);
			}
			result = new Result(txid, Result.OK).putValue("exerciseParams", list);
		} catch(SQLException e) {
			log.error("findCodes", e);
			throw new Byung8Exception(e);
		}
		return result;
	}

	@Override
	public Result getExcParamById(String paramId, String txid) throws Byung8Exception {
		Result result = null;
		try {
			ExerciseParam param = excParamMapper.findExerciseParamById(paramId);
			result = new Result(txid, Result.OK).putValue("exerciseParam", param);
		} catch(SQLException e) {
			log.error("exerciseParam", e);
			throw new Byung8Exception(e);
		}
		return result;
	}
	
	@Override
	public Result getExcAllParams(String txid) throws Byung8Exception {
		Result result = null;
		try {
			List<ExerciseParam> list = excParamMapper.findExerciseAll();
			result = new Result(txid, Result.OK).putValue("findExerciseAll", list);
		} catch(SQLException e) {
			log.error("exerciseParam", e);
			throw new Byung8Exception(e);
		}
		return result;
	}

	@Override
	public Result modifyExerciseParam(ExerciseParam exerciseParam, String txid) throws Byung8Exception {
		Result result = null;
		try {
			int ret = excParamMapper.updateExerciseParam(exerciseParam);
			
			result = new Result(txid, Result.OK).putValue("modifyExerciseParam", ret);
		} catch(SQLException e) {
			log.error("exerciseParam", e);
			throw new Byung8Exception(e);
		}
		return result;
	}
	
	@Override
	public Result modifyExerciseParamNotUsed(ExerciseParam exerciseParam, String txid) throws Byung8Exception {
		Result result = null;
		try {
			int ret = excParamMapper.updateExerciseParamNotUsed(exerciseParam);
			result = new Result(txid, Result.OK).putValue("exerciseParam", ret);
		} catch(SQLException e) {
			log.error("exerciseParam", e);
			throw new Byung8Exception(e);
		}
		return result;
	}
}
