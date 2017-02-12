package graphs.graphAlgs.matching;

import net.datastructures.*;
import graphs.graphAlgs.VertexDegreeComparator;
import java.awt.geom.Point2D;
import java.util.PriorityQueue;
import java.awt.*;

public class GreedyUnweightedMatchingStatic extends MatchingAlgorithm
{

    public void runAlgorithm( AdjacencyListGraph<Point2D.Double, Double>  g )
    {
                                   

    }

    public void draw ( Graphics screen, AdjacencyListGraph<Point2D.Double,Double> testGraph, int minDimension )
    {
        drawNodes ( screen, testGraph, minDimension );
        drawEdges ( screen, testGraph, minDimension );
    }   
}
