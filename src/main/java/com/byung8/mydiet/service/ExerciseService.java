package com.byung8.mydiet.service;

import com.byung8.common.domain.Result;
import com.byung8.common.exception.Byung8Exception;
import com.byung8.mydiet.domain.ExerciseParam;

public interface ExerciseService {
	Result calculateCalorie(String paramId, float weight, int excAmt, String txid) throws Byung8Exception;
	Result registerExercseParam(ExerciseParam exerciseParam, String txid) throws Byung8Exception;
	Result getExcParamById(String paramId, String txid) throws Byung8Exception;
	Result getExcParams(String exerciseName, String txid) throws Byung8Exception;
	Result getExcAllParams(String txid) throws Byung8Exception;
	Result modifyExerciseParam(ExerciseParam exerciseParam, String txid) throws Byung8Exception;
	Result modifyExerciseParamNotUsed(ExerciseParam exerciseParam, String txid) throws Byung8Exception;
}
