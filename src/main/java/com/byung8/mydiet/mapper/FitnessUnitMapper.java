package com.byung8.mydiet.mapper;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.byung8.mydiet.domain.FitnessUnit;

@Mapper
public interface FitnessUnitMapper {
	List<FitnessUnit> findFsUnitListByType(int fsTypeId) throws SQLException;
	List<FitnessUnit> findFsUnitListByTypeAndName(FitnessUnit fsUnit) throws SQLException;
	int registerFsUnit(FitnessUnit fitnessUnit) throws SQLException;
}
