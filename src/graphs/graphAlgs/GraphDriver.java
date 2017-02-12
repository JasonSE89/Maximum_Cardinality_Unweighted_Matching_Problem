package graphs.graphAlgs;

import graphs.graphAlgs.matching.MatchingAlgorithm;

import javax.swing.*;

import java.awt.*;
import java.awt.geom.Point2D;

import net.datastructures.*;

public class GraphDriver extends JPanel
{
    private int minDimension;           // smaller of either the width or height of the output panel
    
    private GraphAlgorithm algorithm;   // indicates which Graph Algorithm the user wishes to execute
    
    private AdjacencyListGraph<Point2D.Double,Double> testGraph;
    
    public static final int NUMBER_TEST_CASES = 1000;

    public GraphDriver ( GraphAlgorithm alg, AdjacencyListGraph<Point2D.Double,Double> testGr )
    {
        setPreferredSize ( new Dimension( 650, 650 ));    
        setBackground ( Color.white );
        algorithm = alg;
        testGraph = testGr;
    }

    public void paintComponent ( Graphics screen )
    {
        super.paintComponent( screen );
        screen.setColor ( Color.black );	
        int pixelWidth = getWidth();
        int pixelHeight = getHeight();
        minDimension = ( pixelWidth < pixelHeight ) ? pixelWidth : pixelHeight;

        /** execute the algorithm on the given sample test graph */
        algorithm.runAlgorithm( testGraph );
        
        /** draw the resulting solution */
        algorithm.draw( screen, testGraph, minDimension );  
        
        /** test the algorithm on many different random input graphs */
        if ( algorithm instanceof MatchingAlgorithm ) {
        	boolean success = MatchingAlgorithm.batchTesting( algorithm, NUMBER_TEST_CASES );
        	
        	if ( success ) {
            	screen.drawString( "The algorithm passed all the tests", 300, 20 );
        	} else {
        		screen.drawString( "The algorithm FAILED on some test graph", 300, 20 );
        	}
        }
        
    }		
}
