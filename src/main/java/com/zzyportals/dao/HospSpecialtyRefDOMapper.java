package com.zzyportals.dao;

import com.zzyportals.dataobject.HospSpecialtyRefDO;
import com.zzyportals.dataobject.HospSpecialtyRefDOKey;

public interface HospSpecialtyRefDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_culpro_hosp_specialty_ref
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int deleteByPrimaryKey(HospSpecialtyRefDOKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_culpro_hosp_specialty_ref
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int insert(HospSpecialtyRefDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_culpro_hosp_specialty_ref
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int insertSelective(HospSpecialtyRefDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_culpro_hosp_specialty_ref
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    HospSpecialtyRefDO selectByPrimaryKey(HospSpecialtyRefDOKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_culpro_hosp_specialty_ref
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int updateByPrimaryKeySelective(HospSpecialtyRefDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_culpro_hosp_specialty_ref
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int updateByPrimaryKey(HospSpecialtyRefDO record);
}