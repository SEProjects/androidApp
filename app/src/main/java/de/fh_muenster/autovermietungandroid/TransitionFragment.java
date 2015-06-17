package de.fh_muenster.autovermietungandroid;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import de.fh_muenster.R;


/**
 * A placeholder fragment containing a simple view.
 */
public class TransitionFragment extends Fragment {

	public TransitionFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_transition_scene_2, container, false);
		return rootView;
	}

}
