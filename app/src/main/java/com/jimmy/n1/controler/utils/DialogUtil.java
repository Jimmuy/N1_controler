package com.jimmy.n1.controler.utils;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

import com.jimmy.n1.controler.R;

public class DialogUtil {

    private DialogUtil() {
        throw new UnsupportedOperationException("cannot be instantiated");
    }


    public static ProgressDialog showProgress(Context context, String message, boolean isScreenLock) {

        ProgressDialog progressDialog = ProgressDialog.show(context, null, message, true, false);
        progressDialog.setCanceledOnTouchOutside(false);// dialog外点击取消dialog
        progressDialog.setCancelable(!isScreenLock);// 返回键有

        return progressDialog;
    }

    public static AlertDialog showAlert(Context context, String title, String message,
                                        String btn, DialogInterface.OnClickListener listener, boolean cancelable) {
        return showAlert(context, title, message, btn, listener, null, null, cancelable);
    }


    public static AlertDialog showAlert(Context context, String title, String message,
                                        String pBtn, DialogInterface.OnClickListener pListener,
                                        String nBtn, DialogInterface.OnClickListener nListener, boolean cancelable) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(context, R.style.Theme_AppCompat_Light_Dialog_Alert);
        if (!TextUtils.isEmpty(title)) {
            alertDialog.setTitle(title);
        }
        alertDialog.setMessage(message);

        if (pBtn != null) {
            alertDialog.setPositiveButton(pBtn, pListener);
        }

        if (nBtn != null) {
            alertDialog.setNegativeButton(nBtn, nListener);
        }
        alertDialog.setCancelable(cancelable);
        return alertDialog.show();
    }

    public static AlertDialog showPrompt(Context context, String message, boolean cancelable) {
        return showAlert(context, null, message, context.getString(R.string.confirm), null, cancelable);
    }

    public static void dismiss(Dialog dialog) {
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
    }

    public static void showInputDialog(Context context, String defaultMsg, String title, final OnInputClickListener inputListener) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        View view = LayoutInflater.from(context).inflate(R.layout.view_input_dialog, null);
        TextView urlBtn = view.findViewById(R.id.btn_url_dialog);
        TextView tvTitle = view.findViewById(R.id.tv_dialog_title);
        final EditText urlText = view.findViewById(R.id.et_url);
        urlText.setHint(defaultMsg);
        urlText.setTextSize(12);
        tvTitle.setText(title);
        final AlertDialog dialog = builder.setView(view).show();
        urlBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputListener.onInputClick(urlText.getText().toString().trim());
                dialog.dismiss();
            }
        });
    }

    public interface OnInputClickListener {
        void onInputClick(String url);
    }

}
