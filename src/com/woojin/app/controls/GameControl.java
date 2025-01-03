package com.woojin.app.controls;

import java.util.Scanner;

import com.woojin.app.units.Character;
import com.woojin.app.units.Pet;
import com.woojin.app.weapons.Sword;

public class GameControl {
	private Scanner sc;
	private GameStage gs;
	public GameControl() {
		this.sc = new Scanner(System.in);
		this.gs = new GameStage();
	}
	
	
	public void Start() {
		
		Character character = new Character();
		System.out.println("캐릭터의 이름을 입력하세요.");
		String n = sc.next();
		character.setName(n);
		
		Sword sword = new Sword();
		
		character.setSword(sword);
		gs.fight(character);
		
		
		
		
		
		
	}
	

}
