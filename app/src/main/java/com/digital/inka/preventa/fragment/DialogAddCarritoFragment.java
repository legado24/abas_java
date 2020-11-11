package com.digital.inka.preventa.fragment;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.DialogFragment;

import com.digital.inka.R;

import java.util.ArrayList;

import cn.pedant.SweetAlert.SweetAlertDialog;


public class DialogAddCarritoFragment extends DialogFragment {

    public CallbackResult callbackResult;

    public void setOnCallbackResult(final CallbackResult callbackResult) {
        this.callbackResult = callbackResult;
    }

    private int request_code = 0;
    private View root_view;
    private Button spn_from_date, spn_from_time;
    private Button spn_to_date, spn_to_time;
    private TextView tv_email;
    private EditText et_name, et_location;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        root_view = inflater.inflate(R.layout.dialog_add_carrito, container, false);



        return root_view;
    }



//    private void sendDataResult() {
//        Event event = new Event();
//        event.email = tv_email.getText().toString();
//        event.name = et_name.getText().toString();
//        event.location = et_location.getText().toString();
//        event.from = spn_from_date.getText().toString() + " (" + spn_from_time.getText().toString() + ")";
//        event.to = spn_to_date.getText().toString() + " (" + spn_to_time.getText().toString() + ")";
//        event.is_allday = cb_allday.isChecked();
//        event.timezone = spn_timezone.getSelectedItem().toString();
//
//        if (callbackResult != null) {
//            callbackResult.sendResult(request_code, event);
//        }
//    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog = super.onCreateDialog(savedInstanceState);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        return dialog;
    }

    public void setRequestCode(int request_code) {
        this.request_code = request_code;
    }

//    private void dialogDatePickerLight(final Button bt) {
//        Calendar cur_calender = Calendar.getInstance();
//        DatePickerDialog datePicker = DatePickerDialog.newInstance(
//                new DatePickerDialog.OnDateSetListener() {
//                    @Override
//                    public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
//                        Calendar calendar = Calendar.getInstance();
//                        calendar.set(Calendar.YEAR, year);
//                        calendar.set(Calendar.MONTH, monthOfYear);
//                        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
//                        long date_ship_millis = calendar.getTimeInMillis();
//                        bt.setText(Tools.getFormattedDateEvent(date_ship_millis));
//                    }
//                },
//                cur_calender.get(Calendar.YEAR),
//                cur_calender.get(Calendar.MONTH),
//                cur_calender.get(Calendar.DAY_OF_MONTH)
//        );
//        //set dark light
//        datePicker.setThemeDark(false);
//        datePicker.setAccentColor(getResources().getColor(R.color.colorPrimary));
//        datePicker.setMinDate(cur_calender);
//        datePicker.show(getActivity().getFragmentManager(), "Datepickerdialog");
//    }
//
//    private void dialogTimePickerLight(final Button bt) {
//        Calendar cur_calender = Calendar.getInstance();
//        TimePickerDialog datePicker = TimePickerDialog.newInstance(new TimePickerDialog.OnTimeSetListener() {
//            @Override
//            public void onTimeSet(TimePickerDialog view, int hourOfDay, int minute, int second) {
//                Calendar calendar = Calendar.getInstance();
//                calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
//                calendar.set(Calendar.MINUTE, minute);
//                calendar.set(Calendar.AM_PM, calendar.get(Calendar.AM_PM));
//                long time_millis = calendar.getTimeInMillis();
//                bt.setText(Tools.getFormattedTimeEvent(time_millis));
//            }
//        }, cur_calender.get(Calendar.HOUR_OF_DAY), cur_calender.get(Calendar.MINUTE), true);
//        //set dark light
//        datePicker.setThemeDark(false);
//        datePicker.setAccentColor(getResources().getColor(R.color.colorPrimary));
//        datePicker.show(getActivity().getFragmentManager(), "Timepickerdialog");
//    }

    public interface CallbackResult {
        void sendResult(int requestCode, Object obj);
    }

}