package com.example.waterchen.monsterhunterworld.data

/**
 * Created by WaterChen on 2018/3/10.
 * 饰品（珠子）描述类
 * 属性：宝珠名称、可镶嵌的孔的最小等级、技能
 */
data class Ornament(val name: String, val level: Int, val skill: Skill) {
}