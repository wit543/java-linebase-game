package com.mygame.game;

import java.io.IOException;

import com.mygame.stroy.start;

public class storyCore {
	public static void storyStart() throws IOException{
		while(1>0){
			setup.getname();
			if(setup.nameconfirm() == 1 ){
				break;
			}
		}
		setup.age();
		properties.stat();
		while(1>0){
			if(continues.continueNext() == 1 ){
				break;
			}
			
		}
		start.introduction();
	}
}
