package org.ldv.melun.sio.swingpac.etudiants;

import java.awt.Color;

import org.ldv.melun.sio.swingpac.Bidule;

public class CptAmericube extends Bidule {
	
	private int nbDeplacements;
	private int nbDeplacements2;

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
    nbDeplacements2++;
    super.doMove();
    // tous les 200 deplacements et si descente
    if (isGoDown() || nbDeplacements2 % 2 == 0) 
      if (isGoLeft())
        goOnRight();
      else
        goOnLeft();
    	
  }

  @Override
  protected void doAfterImpactByOther() {
    super.doAfterImpactByOther();
    nbDeplacements++;
    if (nbDeplacements % 1 == 0) 
        if (isGoLeft())
          goOnRight();
        else
          goOnLeft();
  }
  
}
