package org.mariotaku.twidere.model.tab.impl;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;

import org.mariotaku.twidere.R;
import org.mariotaku.twidere.fragment.DirectMessagesFragment;
import org.mariotaku.twidere.model.tab.DrawableHolder;
import org.mariotaku.twidere.model.tab.StringHolder;
import org.mariotaku.twidere.model.tab.TabConfiguration;

/**
 * Created by mariotaku on 2016/11/27.
 */

public class MessagesTabConfiguration extends TabConfiguration {
    @NonNull
    @Override
    public StringHolder getName() {
        return StringHolder.resource(R.string.direct_messages);
    }

    @NonNull
    @Override
    public DrawableHolder getIcon() {
        return DrawableHolder.Builtin.MESSAGE;
    }

    @AccountFlags
    @Override
    public int getAccountFlags() {
        return FLAG_HAS_ACCOUNT | FLAG_ACCOUNT_MULTIPLE | FLAG_ACCOUNT_MUTABLE;
    }

    @NonNull
    @Override
    public Class<? extends Fragment> getFragmentClass() {
        return DirectMessagesFragment.class;
    }
}
