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
  }

  @Override
  protected void doAfterImpactByOther() {
	nbDeplacements--;
    super.doAfterImpactByOther();
    if (isGoDown() && nbDeplacements % 200 == 0) 
        if (isGoLeft())
          goOnRight();
        else
          goOnLeft();

  }

  
  
}
