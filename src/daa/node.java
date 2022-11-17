package daa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class node {
	String name;
	ArrayList<edge> edgelist=new ArrayList<edge>();
	public node(String s) {
		name=s;
	}
	public void createedge(node a,node b,int weight,ArrayList<edge> edgel) {
		int x=0;
		if(a.edgelist.size()>=1) {
			for(int i=0;i<a.edgelist.size();i++) {
				if(a.edgelist.get(i).firstnode==b||a.edgelist.get(i).secondnode==b) {
					x=2;
					System.out.println("already"+a.name+b.name);
					break;
				}
				
			}
		}
		if(x<2||edgelist.size()<1) 
			{
			edge newedge=new edge();
			newedge.firstnode=a;
			newedge.secondnode=b;
			newedge.weight=weight;
			a.edgelist.add(newedge);
			b.edgelist.add(newedge);
			edgel.add(newedge);
		}
	}
	public void printl() {
		edge[] now=new edge[edgelist.size()];
		for(int i=0;i<edgelist.size();i++) {
			now[i]=edgelist.get(i);
			System.out.println(now[i].weight);
		}
		//System.out.println(edgelist.get(0).weight);
	}
	public int[][] matrix(int[][] dis,node[] citieslist,ArrayList<edge> list) {
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				for(int k=0;k<list.size();k++) {
					if((list.get(k).firstnode==citieslist[i]||list.get(k).secondnode==citieslist[i])&&(list.get(k).firstnode==citieslist[j]||list.get(k).secondnode==citieslist[j])&&(i!=j)) {
						dis[i][j]=list.get(k).weight;
						break;
					}
					else {
						dis[i][j]=0;
					}
					
				}
			}
		}
		return dis;
		
	}
	public void printmatrix(int[][] dis,node[] citieslist) {
		String s=" ";
		System.out.print("       ");
		for(int i=0;i<10;i++) {
			System.out.print(citieslist[i].name+"  ");
		}
		System.out.println("");
		for(int i=0;i<10;i++) {
			System.out.print(citieslist[i].name);
			for(int j=0;j<10;j++) {
				int h=4;
				if(dis[i][j]<=9) {
					h++;
				}
				if(dis[i][j]>=100) {
					h--;
				}
				if(dis[i][j]>=1000) {
					h--;
				}
				if (dis[i][j]!=0||i==j) {
				System.out.print("  "+dis[i][j]+s.repeat(h));
				}
				else {
					System.out.print("  "+"<!>"+"   ");
				}
			}
			System.out.println("");
		}
	}
	public void primAlgorithm(int[][] dis) {
		boolean[] bool=new boolean[10];
		Arrays.fill(bool,false);
		int ed=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the starting node starting from 0 to 9");
		int in=input.nextInt();
		bool[in]=true;
		int x=0,y=0;
		while(ed<14) {
			int min=9999999;
			for(int i=0;i<10;i++) {
				
				if(bool[i]==true)
					for(int j=0;j<10;j++) {
						if(min>dis[i][j]&&dis[i][j]!=0&&bool[j]==false) {
							min=dis[i][j];
							x=j;
							y=i;
						}
					}
			}
			if(min==9999999) {
				break;
			}
			printprim(x,y,min);
			bool[x]=true;
			ed++;
		}
	}
	public void printprim(int x,int y,int min) {
		String s=";";
		String sy=" ";
		if(x==0) {
			s="A";
		}
		else if(x==1) {
			s="B";
		}
		else if(x==2) {
			s="C";
		}
		else if(x==3) {
			s="D";
		}
		else if(x==4) {
			s="E";
		}
		else if(x==5) {
			s="F";
		}
		else if(x==6) {
			s="G";
		}
		else if(x==7) {
			s="H";
		}
		else if(x==8) {
			s="I";
		}
		else if(x==9) {
			s="J";
		}
		if(y==0) {
			sy="A";
		}
		else if(y==1) {
			sy="B";
		}
		else if(y==2) {
			sy="C";
		}
		else if(y==3) {
			sy="D";
		}
		else if(y==4) {
			sy="E";
		}
		else if(y==5) {
			sy="F";
		}
		else if(y==6) {
			sy="G";
		}
		else if(y==7) {
			sy="H";
		}
		else if(y==8) {
			sy="I";
		}
		else if(y==9) {
			sy="J";
		}
		System.out.println(sy+"<-->"+s+"="+min);
	}
}