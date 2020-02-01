package com.jimmy.n1.controler.activity

import android.view.View
import com.gyf.immersionbar.ImmersionBar
import com.jimmy.app.CoreActivity
import com.jimmy.iot.net.callback.CallBack
import com.jimmy.iot.net.exception.ApiException
import com.jimmy.n1.controler.R
import com.jimmy.n1.controler.databinding.ControllerBinding
import com.jimmy.n1.controler.net.HttpManager
import com.jimmy.n1.controler.utils.DialogUtil
import com.jimmy.utils.PreferenceUtils


class ControllerActivity : CoreActivity<ControllerBinding>(), View.OnClickListener {


    private var host = "http://192.168.168.113:8080/v1/"
    private val default = Pair("longclick", false)

    override fun isShowTitleBar(): Boolean {
        return false
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_controller
    }

    override fun initStatusBar() {
        ImmersionBar.with(this).statusBarDarkFont(false, 0.2f)
            .statusBarColor(R.color.trans_black_aa).init()
    }

    override fun initView() {
        super.initView()
        binding.onClick = this
        val domain = PreferenceUtils.getPrefString(this, "domain", "")
        if (domain.isNotBlank()) {
            host = domain
        }

    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_close -> {
                DialogUtil.showAlert(
                    this,
                    "确定关机吗？",
                    "关机将直接退出，请确定",
                    "取消",
                    { dialog, _ -> dialog.dismiss() },
                    "确定",
                    { dialog, _ -> navigate(26) },
                    false
                )
            }
            R.id.btn_top -> {
                navigate(19)
            }
            R.id.btn_left -> {
                navigate(21)
            }
            R.id.btn_right -> {
                navigate(22)
            }
            R.id.btn_bottom -> {
                navigate(20)
            }
            R.id.btn_back -> {
                navigate(4)
            }
            R.id.btn_setting -> {
                val param = HashMap<String, Any>()
                param["action"] = "setting"
                HttpManager.post("action").baseUrl(host).upJson(param).execute(callBack())
            }
            R.id.btn_plus -> {
                navigate(24)
            }
            R.id.btn_home -> {
                navigate(3)
            }
            R.id.btn_menu -> {
                navigate(82)
            }
            R.id.btn_minus -> {
                navigate(25)
            }
            R.id.btn_ok -> {
                navigate(23)
            }
            R.id.btn_ip -> {
                DialogUtil.showInputDialog(this, "请输入N1盒子的IP地址，例如192.1.1.1", "请输入您的盒子IP") {
                    if (it.isBlank()) {
                        showToast("请输入有效的IP，否则将无法使用该遥控器")
                        return@showInputDialog
                    }
                    host = "http://$it:8080/v1/"
                    PreferenceUtils.setPrefString(this, "domain", host)
                }
            }
        }
    }


    private fun navigate(i: Int) {
        val param = hashMapOf(Pair("keycode", i), default)
        HttpManager.post("keyevent").baseUrl(host).upJson(param).execute(callBack())
    }

    private fun callBack(): CallBack<Any> {
        return object : CallBack<Any>() {
            override fun onStart() {
            }

            override fun onCompleted() {
            }

            override fun onSuccess(p0: Any?) {
            }

            override fun onError(p0: ApiException?) {
            }

        }
    }


}