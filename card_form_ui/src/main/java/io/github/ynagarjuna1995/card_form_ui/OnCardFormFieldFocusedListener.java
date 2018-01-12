package io.github.ynagarjuna1995.card_form_ui;

import android.view.View;

/**
 * Listener to receive a callback when a field is focused in the card form
 */
public interface OnCardFormFieldFocusedListener {

    /**
     * @param field that was focused
     */
    void onCardFormFieldFocused(View field);
}
