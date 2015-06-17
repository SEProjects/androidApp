package de.fh_muenster.autovermietungandroid;

import android.app.Activity;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;

import de.fh_muenster.R;
import de.fh_muenster.autovermietungandroid.tasks.LogoutTask;


/**
 * Created by marian on 16.06.15.
 */
public class Homescreen extends Activity {

	private TransitionManager mTransitionManager;
	private Scene mScene1;
	private Scene mScene2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homescreen);

		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
							.add(R.id.container, new TransitionFragment())
							.commit();
		}
		ViewGroup container = (ViewGroup)findViewById(R.id.container);
		TransitionInflater transitionInflater = TransitionInflater.from(this);
		mTransitionManager = transitionInflater.inflateTransitionManager(R.transition.transition_manager, container);
		mScene1 = Scene.getSceneForLayout(container, R.layout.fragment_transition_scene_1, this);
		mScene2 = Scene.getSceneForLayout(container, R.layout.fragment_transition_scene_2, this);
	}

	public void goToScene1(View view) {
		mTransitionManager.transitionTo(mScene1);
	}

	public void goToScene2(View view) {
		mTransitionManager.transitionTo(mScene2);
	}

	public void logOut(View view) {
		LogoutTask logoutTask = new LogoutTask(view.getContext(),(MainApplication) getApplication());
		logoutTask.execute();
	}

}
