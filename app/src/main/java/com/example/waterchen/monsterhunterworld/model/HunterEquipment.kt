package com.example.waterchen.monsterhunterworld.model

import com.example.waterchen.monsterhunterworld.data.Equipment
import com.example.waterchen.monsterhunterworld.data.Ornament
import com.example.waterchen.monsterhunterworld.data.Skill

/**
 * Created by WaterChen on 2018/3/12.
 */
class HunterEquipment constructor(_equipment: Equipment, _skills: List<Skill>, _holds: List<Int>) {

    val equipment : Equipment
    val skills: List<Skill>
    val holds: List<Int>
    val ornaments: MutableList<Ornament>

    init {
        equipment = _equipment
        skills = _skills
        holds = _holds
        ornaments = arrayListOf()
    }

    fun isHasSkill(skill : Skill) : Boolean{
        return true
    }

    /**
     * 向装备添加宝珠
     * 1.检查装备的宝珠槽是否已经插满
     * 2.检查该宝珠是否能够插在装备上
     */
    fun addOrnament(ornament: Ornament) : Boolean{
        var canEquipOrnament = false
        for(holdLevel in holds){
            if(ho)
        }

        return true;
    }


}