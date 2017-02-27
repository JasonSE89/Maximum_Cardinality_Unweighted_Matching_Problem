package graphs.graphAlgs;

import graphs.graphAlgs.DrawGraph;
import graphs.graphAlgs.GraphAlgorithm;
import graphs.graphAlgs.GraphDriver;
import graphs.graphAlgs.matching.*;
import graphs.graphAlgs.sampleInputGraphs.*;

import javax.swing.*;

import java.awt.geom.Point2D;

import net.datastructures.*;

public class Driver
{	

    /**
     * Query the User about which Graph Algorithm he/she wishes to execute, and
     * which sample input graph should be used by the algorithm, and then
     * execute that algorithm and display the results.
     */
    public static void main( String args[] )
    {
    	System.out.println ( "hello world" );
    	
        /** identifies which algorithm will be executed */
        GraphAlgorithm algorithm = selectAlgorithm();

        /** the algorithm will be executed on the selected test graph */
        AdjacencyListGraph<Point2D.Double,Double> testGraph = initializeSampleGraph();

        /** execute the algorithm and display the solution */
        JFrame  frame = new JFrame ( );
        frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        frame.getContentPane().add( new GraphDriver( algorithm, testGraph ) );
        frame.pack();
        frame.setVisible(true);
        
    	System.out.println ( "goodbye world" );
    }
    
   
    /**
     * Query the User about which Graph Algorithm he/she wishes to execute
     */
    private static GraphAlgorithm selectAlgorithm()
    {
        GraphAlgorithm algorithm = null;

        String[] algorithmOptions = {
                "Draw the Graph", 
                "Greedy Unweighted Matching, obvious",
                "Greedy Unweighted Matching, static",
                "Greedy Unweighted Matching, dynamic"
            };    

        String choice = (String)JOptionPane.showInputDialog(
                null,   
                "Select which algorithm you wish to execute",
                "Graph Algorithm",
                JOptionPane.PLAIN_MESSAGE,
                null,  
                algorithmOptions,
                algorithmOptions[0]);

        if ( choice == null ) 
            System.exit(1);    // abort the program  

        if ( choice.equals ( algorithmOptions[0] ) )
            algorithm = new DrawGraph(); 

        else if ( choice.equals ( algorithmOptions[1] ) )
        	algorithm = new GreedyUnweightedMatchingObvious();

        else if ( choice.equals ( algorithmOptions[2] ) )
            algorithm = new GreedyUnweightedMatchingStatic(); 

        else 
            algorithm = new GreedyUnweightedMatchingDynamic(); 
        
        return algorithm;
    }

    /**
     * Query the User about which sample graph he/she wished to use
     */
    private static AdjacencyListGraph<Point2D.Double,Double> initializeSampleGraph()
    {  
        String[] sampleGraphOptions = {
                "Complete graph, n = 26",
                "Dense graph, n = 26",
                "Small graph, n = 8", 
                "Tree, n = 26",
                "Huge graph, n = 225",
                "Random graph, n = 25",
                "Bipartite graph, n = 34"
            };  

        String choice = (String)JOptionPane.showInputDialog(
                null,   
                "Select which input graph you wish to use",
                "Input Graph",
                JOptionPane.PLAIN_MESSAGE,
                null,  
                sampleGraphOptions,
                sampleGraphOptions[0]);

        if ( choice == null ) 
            System.exit(1);    // abort the program  

        if ( choice.equals ( sampleGraphOptions[0] ) )
            return (new SampleCompleteGraph()).getSampleGraph();

        else if ( choice.equals ( sampleGraphOptions[1] ) )
            return (new SampleDenseGraph()).getSampleGraph(); 

        else if ( choice.equals ( sampleGraphOptions[2] ) )
            return (new SampleSmallGraph()).getSampleGraph(); 

        else if ( choice.equals ( sampleGraphOptions[3] ) )
            return (new SampleTree()).getSampleGraph();  

        else if ( choice.equals ( sampleGraphOptions[4] ) )
            return (new SampleHugeGraph()).getSampleGraph();     

        else if ( choice.equals ( sampleGraphOptions[5] ))
            return (new SampleRandomGraph()).getSampleGraph(); 
        
        else 
            return (new SampleBipartiteGraph()).getSampleGraph();   
    }    
}