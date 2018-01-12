package io.github.ynagarjuna1995.card_form_ui.view;

import android.content.Context;
import android.text.InputType;
import android.util.AttributeSet;

import io.github.ynagarjuna1995.card_form_ui.R;


/**
 * Created by nagarjuna on 12/01/18.
 */

public class AddressEditText extends ErrorEditText {


    public AddressEditText(Context context) {
        super(context);
        init();
    }

    public AddressEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public AddressEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        if (isInEditMode()) {
            return;
        }
        setInputType(InputType.TYPE_TEXT_VARIATION_POSTAL_ADDRESS);
    }

    /**
     * @return the unformatted mobile number entered by the user
     */
    public String getaddress() {
        return getText().toString();
    }

    @Override
    public boolean isValid() {
        return isOptional() || getText().toString().length() >= 8;
    }

    @Override
    public String getErrorMessage() {
        return getContext().getString(R.string.bt_address1_required);
    }
}
