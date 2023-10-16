package com.lj.crewpnr.mapper.pssdb;

import com.lj.crewpnr.vo.CrewPNRLogCriteriaVO;
import com.lj.crewpnr.vo.CrewPnrLogVO;

import java.util.List;

public interface CrewBookingMapper {
    int insertCrewPnrLog(CrewPnrLogVO crewPnrLogVO);
    List<CrewPnrLogVO> getCreateBookingFailLog(CrewPNRLogCriteriaVO criteriaVO);
}
