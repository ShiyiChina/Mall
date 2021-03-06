package com.leyou.item.service;


import com.leyou.item.pojo.SpecGroup;
import com.leyou.item.pojo.SpecParam;

import java.util.List;

public interface SpecificationService {

    List<SpecGroup> queryGroupsWithParam(Long cid);

    List<SpecGroup> queryGroupsByCid(Long cid);

    List<SpecParam> queryParams(Long gid, Long cid, Boolean generic, Boolean searching);

    void saveParam(SpecParam specParam);

    void deleteParam(Long id);

    void saveGroup(SpecGroup specGroup);

    void deleteGroup(Long id);

    void updateGroup(SpecGroup specGroup);

    void updateParam(SpecParam specParam);

}
