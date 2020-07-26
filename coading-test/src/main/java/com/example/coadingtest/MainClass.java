package com.example.coadingtest;
public class MainClass {
	public static void main(String[] args) {
		String upRight[] =new String[] {"2 3","3 7","4 1"};
		String[] strArray = upRight[0].split(" ");
		int maxRow=Integer.parseInt(strArray[0]);int maxColumn=Integer.parseInt(strArray[1]);
		for(int i=1; i<upRight.length; i++)
		{
			String[] strArrayTemp = upRight[i].split(" ");
			if(maxRow<Integer.parseInt(strArrayTemp[0]))
			{
			maxRow=Integer.parseInt(strArrayTemp[0]);
			}
			if(maxColumn<Integer.parseInt(strArrayTemp[1]))
			{
			maxColumn=Integer.parseInt(strArrayTemp[1]);
			}
			
		}
		System.out.println("row , cplumn " +maxRow +" " +maxColumn);
		int [][] arrayData=new int[maxRow] [maxColumn];
		for(int i=0; i<upRight.length; i++)
		{
			String[] temp = upRight[i].split(" ");
			int row=Integer.parseInt(temp[0]);
			int column=Integer.parseInt(temp[1]);
			
			for(int j=0;j<row;j++)
			{
				for(int k=0;k<column; k++)
				{
					arrayData[j][k]=arrayData[j][k]+1;
				}
			}
		}
		int maxElement=arrayData[0][0];
		int count = 0;
		for (int i = 0; i < arrayData.length; i++) 
		{  
            // Loop through all elements of current row 
			
            for (int j = 0; j < arrayData[i].length; j++)
            {
                System.out.print(arrayData[i][j] + " "); 
            if (arrayData[i][j] > maxElement)
            {
            	maxElement=arrayData[i][j];
            }
		}	
	}
		System.out.println("max element "+maxElement);

	for (int i = 0; i < arrayData.length; i++) 
	{  
        // Loop through all elements of current row 
		
        for (int j = 0; j < arrayData[i].length; j++)
        {
        if (arrayData[i][j] == maxElement)
        {
        	count++;
        }
	}	
}
	System.out.println("count is " +count);
}
}
