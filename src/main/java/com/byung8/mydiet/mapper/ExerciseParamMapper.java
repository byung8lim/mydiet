package com.byung8.mydiet.mapper;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.byung8.mydiet.domain.ExerciseParam;

@Mapper
public interface ExerciseParamMapper {
	int registerExerciseParam(ExerciseParam exerciseParam) throws SQLException;
	ExerciseParam findExerciseParamById(int paramId) throws SQLException;
	List<ExerciseParam> findExerciseParamsByName(String paramName) throws SQLException;
	List<ExerciseParam> findExerciseAll() throws SQLException;
	List<ExerciseParam> findExerciseAllParams() throws SQLException;
	int updateExerciseParam(ExerciseParam exerciseParam) throws SQLException;
	int updateExerciseParamNotUsed(ExerciseParam exerciseParam) throws SQLException;
}
