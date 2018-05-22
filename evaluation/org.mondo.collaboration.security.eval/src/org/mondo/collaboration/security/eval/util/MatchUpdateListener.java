package org.mondo.collaboration.security.eval.util;

import org.eclipse.viatra.query.runtime.api.IMatchUpdateListener;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;

public class MatchUpdateListener implements IMatchUpdateListener<IPatternMatch> {

	private final String user;

	public MatchUpdateListener(String user) {
		this.user = user;
	}
	
	@Override
	public void notifyAppearance(IPatternMatch match) {
		if(match.get("user").equals(user)) {
			//Do notification
		}
	}

	@Override
	public void notifyDisappearance(IPatternMatch match) {
		if(match.get("user").equals(user)) {
			//Do notification
		}
	}

}
