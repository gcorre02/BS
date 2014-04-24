package test;

import static org.junit.Assert.*;
import main.BattleShipGame;
import main.BattleShipGameFace;
import main.UserInterface;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Matchers.anyString;

public class BattleShipGameTest {
	BattleShipGame bsg;
	UserInterface ui;
	
	@Before
	public void setUp() throws Exception {
		bsg = new BattleShipGame();
		ui = mock(UserInterface.class);
		bsg.setUi(ui);
	}

	@After
	public void tearDown() throws Exception {
	}

	//@Test
	public void testMain() {
		BattleShipGameFace.main(new String[]{});
	}

	@Test
	public void testBattleShipGame() {
		String shots[] = new String[202];
		int j = 1;
		int c = 0;
		for(int i = 1; i <201; i+=2){
			shots[i] = String.valueOf(c);
			shots[i+1] = String.valueOf(j);
			j++;
			if(j==10){
				j = 0;
				c++;
			}
		}
		shots[0] = "0";
		when(ui.getUserAnswer(anyString())).thenReturn('A','B');
		when(ui.readFromUser()).thenReturn("0",shots);
		bsg.run();
		
		
	}

	@Test
	public void testRun() {
		fail("Not yet implemented");
	}

	@Test
	public void testRunMenu() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetUpTheGame() {
		fail("Not yet implemented");
	}

	@Test
	public void testTakeShots() {
		fail("Not yet implemented");
	}

	@Test
	public void testDisplayGrid() {
		fail("Not yet implemented");
	}

	@Test
	public void testDisplayResults() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrintFinalScores() {
		fail("Not yet implemented");
	}

}
