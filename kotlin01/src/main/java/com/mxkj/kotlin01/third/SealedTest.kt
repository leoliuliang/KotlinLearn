package com.mxkj.kotlin01.third

/** 密封类 , 当枚举不能满足业务时，考虑一下密封类*/
sealed class LicenseStates{
    object UnQualified: LicenseStates()
    object Learning : LicenseStates()
    //有驾照的时候才有驾驶证id
    class Qualified(val licenseId:String) : LicenseStates()
}

class Drives(var status: LicenseStates){
    fun checkLicense(): String{
        return when(status){
            is LicenseStates.UnQualified -> "没驾驶证"
            is LicenseStates.Learning -> "学习中"
            is LicenseStates.Qualified -> "已经考取驾驶证：驾驶证编号：${(this.status as LicenseStates.Qualified).licenseId}"
        }
    }
}

fun main() {
    val status = LicenseStates.Qualified("15658416")
    val drives = Drives(status)
    println(drives.checkLicense())
}