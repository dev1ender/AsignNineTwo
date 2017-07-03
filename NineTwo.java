import java.util.ArrayList;
import java.util.Iterator;



//clas that contain the main method 
public class NineTwo {
	
	//main method
	public static void main(String []args){
		
			//HDTV class object created
			HDTV tv1 = new HDTV("Sony",40);
			HDTV tv2 = new HDTV("Sony1",56);
			HDTV tv3 = new HDTV("Sony2",60);
		
			//Arraylist creaeted that ccan hold the HDTV object
			ArrayList<HDTV> list = new ArrayList<HDTV>();
			
			//HDTV object added to the arraylist
			list.add(tv1);
			list.add(tv2);
			list.add(tv3);
			list.add(tv1);
			list.add(tv2);
			//Iterator created that can iterate thorugh all the elements of the arraylist
			 Iterator<HDTV> itr=list.iterator();  
			 
			 Iterator<HDTV> ir=list.iterator();  
			 ArrayList<HDTV> filterList = new ArrayList<HDTV>();
			 
			 System.out.println("content of original arraylist");
			 while(itr.hasNext()){
				 HDTV st=(HDTV)itr.next();  
				 System.out.println(st.Brandname+" "+st.Size); 
			 }
			 
			 System.out.println("content of arraylist after removing the dulicated");
			  //traversing elements of ArrayList object  
			  while(ir.hasNext()){  
			    HDTV st=(HDTV)ir.next();  
			    boolean flag = true;
			    for(int i =0;i<filterList.size();i++){   //looping through till the size of filterarray 
			    	if(filterList.get(i).equals(st)){		//checking and matching a element to all the element of filterarray
			    		flag=false;							//if match found flag will be set to false
			    		break;
			    	}
			    }
			    if(flag==true){								//if flaag to true and add the element to the filterlist
			    	filterList.add(st);
			    	
			    	System.out.println(st.Brandname+" "+st.Size);		//printing its value
			    }
			    
			    
			  } 
			 
			  
			  
			 
			  
			  
			 }   
	}

