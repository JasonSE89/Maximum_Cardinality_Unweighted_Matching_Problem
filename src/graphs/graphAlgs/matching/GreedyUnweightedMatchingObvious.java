package graphs.graphAlgs.matching;

import net.datastructures.*;
import java.awt.geom.Point2D;
import java.awt.*;

public class GreedyUnweightedMatchingObvious extends MatchingAlgorithm
{

	public void runAlgorithm( AdjacencyListGraph<Point2D.Double, Double>  g )
	{
		// initialize all vertices to be FREE (ie unmatched)
		for ( Vertex v : g.vertices() )
			v.put ( VERTEX_STATUS, FREE );  

		// initialize all the edges to be FREE (not in the matching)
		for ( Edge e : g.edges() )
			e.put ( EDGE_STATUS, FREE );                

        // examine every edge in the graph, if it is possible to
		// add it to the matching, then do so.
		for ( Edge currEdge : g.edges() )
		{
			Vertex[] endpts = g.endVertices ( currEdge );
			Vertex endPoint1 = endpts[0];
			Vertex endPoint2 = endpts[1];

			// check if the vertices are already incident to a chosen/matched edge
			if ( endPoint1.get(VERTEX_STATUS) == FREE  &&
			     endPoint2.get(VERTEX_STATUS) == FREE	    ) {

				// add this edge to the solution matching
				endPoint1.put ( VERTEX_STATUS, MATCHED );
				endPoint2.put ( VERTEX_STATUS, MATCHED );
				currEdge.put ( EDGE_STATUS, MATCHED );
			}
		}  // end of "examine all edges loop"
	}

	public void draw ( Graphics screen, AdjacencyListGraph<Point2D.Double,Double> testGraph, int minDimension )
	{
		drawNodes ( screen, testGraph, minDimension );
		drawEdges ( screen, testGraph, minDimension );
	}   
}
