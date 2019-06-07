package br.com.jvictororiz.libs.ui.main.dialogs;

import android.content.Context;
import android.view.View;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import br.com.jvictororiz.libs.R;


/**
 * Created by eduardo.sampaio on 06/11/17.
 */

public abstract class SuperSheetPopup {
    protected Context context;
    protected BottomSheetDialog mBottomSheetDialog;
    private View view;
    private boolean showing;

    public SuperSheetPopup(Context context) {
        this.context = context;
    }

    public void show() {
        showing = true;
        if (view == null) {
            mBottomSheetDialog = new BottomSheetDialog(context, R.style.SheetDialog);
            view =  createView();
            mBottomSheetDialog.setContentView(view);
        }
        mBottomSheetDialog.show();
    }

    public void resetView(View view) {
        if (view != null){
            mBottomSheetDialog = new BottomSheetDialog(context);
            mBottomSheetDialog.setContentView(view);
        }
    }

    public boolean isShowing() {
        return showing;
    }

    public void dismiss() {
        showing = false;
        if (mBottomSheetDialog != null) {
            mBottomSheetDialog.dismiss();
        }
    }
    protected abstract View createView();

}
