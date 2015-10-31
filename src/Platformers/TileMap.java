package Platformers;
import java.io.*;
import java.awt.*;

public class TileMap {
private int x,y;
private int tileSize;
private int[][] map;
private int mapWidth,mapHeight;
public TileMap(String s,int tileSize){
	this.tileSize=tileSize;
	try {
		BufferedReader br= new BufferedReader(new FileReader(s));
		mapWidth=Integer.parseInt(br.readLine());
		mapHeight=Integer.parseInt(br.readLine());
		map=new int[mapHeight][mapWidth];
		String delimiters=" ";
		for(int row=0;row<mapHeight;row++){
		String line = br.readLine();
		String[] tokens= line.split(delimiters);
			for(int column=0;column<mapWidth;column++){
				map[row][column]=Integer.parseInt(tokens[column]);
				
			}
		}
	}
	catch (Exception e){
		
	}
}
public void update(){
	
}
public void draw(Graphics2D g) {
	for ( int row=0;row<mapHeight;row++){
		for(int col=0;col<mapWidth;col++){
			int rc=map[row][col];
			if(rc==0){
				g.setColor(Color.BLACK);
			}
			if(rc==1){
				g.setColor(Color.WHITE);
			}
			g.fillRect(x+col*tileSize,y+row*tileSize, tileSize, tileSize);
		}
	}
}
}

