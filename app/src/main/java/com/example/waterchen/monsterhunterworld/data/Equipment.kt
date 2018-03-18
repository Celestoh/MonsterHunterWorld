package com.example.waterchen.monsterhunterworld.data

/**
 * Created by WaterChen on 2018/3/10.
 * 装备描述类
 * 属性：装备名称、 可镶嵌孔列表，已有技能列表, 部位, 套装技能
 */
data class Equipment(val name:String, val skillList: List<Skill>,
                     val hole: List<Int>, val part : Int, val partSkill : Skill) {

}