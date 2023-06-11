package com.jdt.ble_central_kit.controller.callback

import android.bluetooth.le.ScanResult

interface BleScanCallback {
    fun onScanStarted(success: Boolean)
    fun onScanFailed()
    fun onScanResult(result: ScanResult)
    fun onScanFinished()
}