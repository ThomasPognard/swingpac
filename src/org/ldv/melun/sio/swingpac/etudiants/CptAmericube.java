package org.ldv.melun.sio.swingpac.etudiants;

import java.awt.Color;

import org.ldv.melun.sio.swingpac.Bidule;

public class CptAmericube extends Bidule {

	private int nbDeplacements;

	public CptAmericube(String name) {
		super(name);
	}

	public CptAmericube() {
		super("CptAmericube");
		setBackground(Color.BLUE);
	}

	@Override
	public void doMove() {
		super.doMove();
		nbDeplacements++;
		if (isGoUp() || nbDeplacements % 200 == 1)
			if (isGoLeft())
				goOnRight();
			else
				goOnLeft();

	}

	@Override
	protected void doAfterImpactByOther() {
		super.doAfterImpactByOther();
		if (isGoLeft())
			goOnDown();
		else
			goOnLeft();
	}

}
