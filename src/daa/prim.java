package daa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class primsAlgorithm {

	public static void main(String[] args) {
		ArrayList<edge> list=new ArrayList<edge>();
		node na=new node("City A");
		node nb=new node("City B");
		node nc=new node("City C");
		node nd=new node("City D");
		node ne=new node("City E");
		node nf=new node("City F");
		node ng=new node("City G");
		node nh=new node("City H");
		node ni=new node("City I");
		node nj=new node("City J");
		na.createedge(na, nb, 10,list);
		na.createedge(na, nc, 18,list);
		na.createedge(na, nf, 44,list);
		na.createedge(na, ng, 81,list);
		na.createedge(nb, ne, 45,list);
		na.createedge(nc, nd, 23,list);
		na.createedge(nb, ng, 79,list);
		na.createedge(nc, nb, 167,list);
		na.createedge(nd, nb, 56,list);
		na.createedge(nd, ne, 16,list);
		na.createedge(ne, ng, 12,list);
		na.createedge(ne, nf, 24,list);
		na.createedge(ng, nf, 13,list);
		na.createedge(na, nj, 11,list);
		na.createedge(nb, ni, 7308,list);
		na.createedge(nc, nj, 22,list);
		na.createedge(nd, nh, 91,list);
		na.createedge(nh, ni, 29,list);
		na.createedge(ng, nh, 54,list);
		na.createedge(ng, ni, 34,list);
		na.createedge(nj, ni, 334,list);
		node[] citieslist=new node[10];
		citieslist[0]=na;
		citieslist[1]=nb;
		citieslist[2]=nc;
		citieslist[3]=nd;
		citieslist[4]=ne;
		citieslist[5]=nf;
		citieslist[6]=ng;
		citieslist[7]=nh;
		citieslist[8]=ni;
		citieslist[9]=nj;
		int[][] dis=new int[10][10];
		na.matrix(dis, citieslist, list);
		na.printmatrix(dis, citieslist);
		na.primAlgorithm(dis);
	}
}

