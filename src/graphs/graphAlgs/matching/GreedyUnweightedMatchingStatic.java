package graphs.graphAlgs.matching;

import net.datastructures.*;
import graphs.graphAlgs.VertexDegreeComparator;
import java.awt.geom.Point2D;
import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.awt.*;

public class GreedyUnweightedMatchingStatic extends MatchingAlgorithm
{
	PriorityQueue<Vertex<java.awt.geom.Point2D.Double>> vertices = new PriorityQueue<Vertex<java.awt.geom.Point2D.Double>>(new VertexDegreeComparator());

	public void runAlgorithm( AdjacencyListGraph<Point2D.Double, Double>  g )
	{



		for (Vertex<java.awt.geom.Point2D.Double> v: g.vertices())
		{
			v.put(VERTEX_STATUS, FREE);
			v.put(DEGREE, g.degree(v));
			vertices.add(v);
		}


		for (Edge e: g.edges())
		{
			e.put(EDGE_STATUS, FREE);
		}


		while(vertices.isEmpty()!=true)
		{

			Vertex<java.awt.geom.Point2D.Double> least_value = vertices.poll();
			if(least_value.get(VERTEX_STATUS).equals(MATCHED))
			{
				continue;
			}
			PriorityQueue<Vertex<java.awt.geom.Point2D.Double>> damn = new PriorityQueue<Vertex<java.awt.geom.Point2D.Double>>(new VertexDegreeComparator());
			for(Edge currEdge :  g.incidentEdges(least_value))
			{
				Vertex endpt = g.opposite (least_value, currEdge );
				if(endpt.get(VERTEX_STATUS)==FREE)
				{
					damn.add(endpt);
				}
			}
			if(damn.isEmpty()==false)
			{
				Vertex<java.awt.geom.Point2D.Double> neighbor = damn.poll();
				for(Edge currEdge : g.edges())
				{

					Vertex<java.awt.geom.Point2D.Double>[] endpts = g.endVertices(currEdge);
					if(endpts[0].equals(least_value) && endpts[1].equals(neighbor))
					{	

						currEdge.put(EDGE_STATUS, MATCHED);
						least_value.put(VERTEX_STATUS, MATCHED);
						neighbor.put(VERTEX_STATUS, MATCHED);


					}
				}
			}


		}
		}

	






















	public void draw ( Graphics screen, AdjacencyListGraph<Point2D.Double,Double> testGraph, int minDimension )
	{
		drawNodes ( screen, testGraph, minDimension );
		drawEdges ( screen, testGraph, minDimension );
	}   
}
