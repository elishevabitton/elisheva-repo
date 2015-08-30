package clique_algo_beforChanges;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class Junit_Test {

	@Test
	public void runningTests() throws IOException{
		vertexSetTest();
		readingAndWritingTest("test1.csv"); //The original file
	}

	private void vertexSetTest(){
		VertexSet vs = new VertexSet(), vs2 = new VertexSet(), vs3,vs4,vs5;
		for(int i=1; i<=10; i++){
			vs.add(i);
		}
		//1 2 3 4 5 6 7 8 9 10
		for(int i=1; i<=20; i=i+3){
			vs2.add(i);
		}
		//1 4 7 10 13 17 20
		vs5=new VertexSet(vs);
		for(int i=0; i<vs5.size() && i<vs.size(); i++){
			assertEquals(vs.at(i), vs5.at(i));
		}
		vs3=vs.intersection(vs2); // 1 4 7 10
		vs4=vs2.intersection(vs);
		assertEquals(vs3.size(),vs4.size());
		for(int i=0; i<vs3.size() && i<vs4.size(); i++){
			assertEquals(vs3.at(i),vs4.at(i));
		}
	}

	private void readingAndWritingTest(String in_file) throws IOException{
		int minQ=5, maxQ=7;
		Graph _gr = new Graph(in_file, 0.8); //The original file
		String out_file = in_file+"_"+0.8+"_"+minQ+"_"+maxQ+".csv";
		assertEquals(_gr.Ni(19).at(0), 31);
		assertEquals(_gr.Ni(100).size(), 0);
		String str="Set: |8| 207, 339, 340, 351, 352, 495, 496, 783, ";
		assertEquals(_gr.Ni(206).toString(), str);
		_gr.All_Cliques_DFS(out_file, minQ, maxQ);
		FileReader _fr=new FileReader(out_file);
		BufferedReader _br=new BufferedReader(_fr);
		_br.readLine();
		_br.readLine();
		assertEquals(_br.readLine(), "0, 7,5, 37,49,193,339,340,");
		int i=0;
		while(i<18){
			_br.readLine();
			i++;
		}
		assertEquals(_br.readLine(), "19, 7,7, 37,49,328,339,340,341,483,");
		_br.close();
	}

}
