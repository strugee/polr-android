package net.strugee.polr;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v4.app.DialogFragment;
import android.app.Dialog;
import android.os.Bundle;

public class ConfirmAnonymousLoginDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage(R.string.confirm_anonymous)
                .setPositiveButton(R.string.continue_anonymously, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // Continue anonymously
                        // TODO
                    }
                })
                .setNegativeButton(R.string.cancel_anonymous, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Just let the system destroy the dialog
                    }
                });

        return builder.create();
    }
}
