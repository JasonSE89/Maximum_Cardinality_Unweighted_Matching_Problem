package graphs.graphAlgs.sampleInputGraphs;

import net.datastructures.*;
import graphs.graphAlgs.GraphAlgorithm;

import java.awt.geom.Point2D;

public class SampleBipartiteGraph
{
   public AdjacencyListGraph<Point2D.Double, Double> g;

   public SampleBipartiteGraph ( )
   {
        g = new AdjacencyListGraph<Point2D.Double, Double>( );
 
        Vertex<Point2D.Double> [] vArray = new Vertex [34];
        
        vArray[ 0 ] = g.insertVertex ( new Point2D.Double ( 0.90, 0.50 ) );
        vArray[ 1 ] = g.insertVertex ( new Point2D.Double ( 0.81, 0.40 ) );
        vArray[ 2 ] = g.insertVertex ( new Point2D.Double ( 0.72, 0.50 ) );
        vArray[ 3 ] = g.insertVertex ( new Point2D.Double ( 0.72, 0.40 ) );        
        vArray[ 4 ] = g.insertVertex ( new Point2D.Double ( 0.18, 0.40 ) );
        vArray[ 5 ] = g.insertVertex ( new Point2D.Double ( 0.18, 0.50 ) );
        
        // WIDGET
        vArray[ 6 ] = g.insertVertex ( new Point2D.Double ( 0.09, 0.60 ) );
        vArray[ 7 ] = g.insertVertex ( new Point2D.Double ( 0.18, 0.60 ) );  
        vArray[ 8 ] = g.insertVertex ( new Point2D.Double ( 0.27, 0.60 ) );
        vArray[ 9 ] = g.insertVertex ( new Point2D.Double ( 0.36, 0.60 ) );
        vArray[ 10 ] = g.insertVertex ( new Point2D.Double ( 0.09, 0.70 ) );
        vArray[ 11 ] = g.insertVertex ( new Point2D.Double ( 0.18, 0.70 ) );        
        vArray[ 12 ] = g.insertVertex ( new Point2D.Double ( 0.27, 0.70 ) );
        vArray[ 13 ] = g.insertVertex ( new Point2D.Double ( 0.36, 0.70 ) );
        
        // WIDGET
        vArray[ 14 ] = g.insertVertex ( new Point2D.Double ( 0.09, 0.20 ) );
        vArray[ 15 ] = g.insertVertex ( new Point2D.Double ( 0.18, 0.20 ) );         
        vArray[ 16 ] = g.insertVertex ( new Point2D.Double ( 0.27, 0.20 ) );
        vArray[ 17 ] = g.insertVertex ( new Point2D.Double ( 0.36, 0.20 ) );
        vArray[ 18 ] = g.insertVertex ( new Point2D.Double ( 0.09, 0.30 ) );
        vArray[ 19 ] = g.insertVertex ( new Point2D.Double ( 0.18, 0.30 ) );        
        vArray[ 20 ] = g.insertVertex ( new Point2D.Double ( 0.27, 0.30 ) );
        vArray[ 21 ] = g.insertVertex ( new Point2D.Double ( 0.36, 0.30 ) );
        
        // WIDGET
        vArray[ 22 ] = g.insertVertex ( new Point2D.Double ( 0.45, 0.20 ) );
        vArray[ 23 ] = g.insertVertex ( new Point2D.Double ( 0.54, 0.20 ) );  
        vArray[ 24 ] = g.insertVertex ( new Point2D.Double ( 0.63, 0.20 ) );
        vArray[ 25 ] = g.insertVertex ( new Point2D.Double ( 0.72, 0.20 ) );
        vArray[ 26 ] = g.insertVertex ( new Point2D.Double ( 0.81, 0.20 ) );
        vArray[ 27 ] = g.insertVertex ( new Point2D.Double ( 0.90, 0.20 ) );  
        
        vArray[ 28 ] = g.insertVertex ( new Point2D.Double ( 0.45, 0.30 ) );
        vArray[ 29 ] = g.insertVertex ( new Point2D.Double ( 0.54, 0.30 ) );
        vArray[ 30 ] = g.insertVertex ( new Point2D.Double ( 0.63, 0.30 ) );
        vArray[ 31 ] = g.insertVertex ( new Point2D.Double ( 0.72, 0.30 ) );         
        vArray[ 32 ] = g.insertVertex ( new Point2D.Double ( 0.81, 0.30 ) );
        vArray[ 33 ] = g.insertVertex ( new Point2D.Double ( 0.90, 0.30 ) );  
        
        for ( int i=0; i < g.numVertices(); i++ )     
          vArray[i].put ( GraphAlgorithm.NAME, "" + i );
       	    
        addEdge ( vArray[0], vArray[1] );   
        addEdge ( vArray[1], vArray[2] );         
        addEdge ( vArray[2], vArray[3] );   
        addEdge ( vArray[2], vArray[4] );         
        addEdge ( vArray[4], vArray[5] );   
      
        // WIDGET
        addEdge ( vArray[5], vArray[6] );        
        addEdge ( vArray[5], vArray[7] );        
        addEdge ( vArray[5], vArray[8] );       
        addEdge ( vArray[5], vArray[9] );
        
        addEdge ( vArray[6], vArray[10] );        
        addEdge ( vArray[6], vArray[11] );         
        addEdge ( vArray[6], vArray[12] );        
        addEdge ( vArray[6], vArray[13] );   
        
        addEdge ( vArray[7], vArray[10] );        
        addEdge ( vArray[7], vArray[11] );         
        addEdge ( vArray[7], vArray[12] );        
        addEdge ( vArray[7], vArray[13] ); 
        
        addEdge ( vArray[8], vArray[10] );        
        addEdge ( vArray[8], vArray[11] );         
        addEdge ( vArray[8], vArray[12] );        
        addEdge ( vArray[8], vArray[13] );   
        
        addEdge ( vArray[9], vArray[10] );        
        addEdge ( vArray[9], vArray[11] );         
        addEdge ( vArray[9], vArray[12] );        
        addEdge ( vArray[9], vArray[13] ); 
        
        // WIDGET
        addEdge ( vArray[4], vArray[18] );
        addEdge ( vArray[4], vArray[19] );        
        addEdge ( vArray[4], vArray[20] );
        addEdge ( vArray[4], vArray[21] );         
        
        addEdge ( vArray[18], vArray[14] );        
        addEdge ( vArray[18], vArray[15] );          
        addEdge ( vArray[18], vArray[16] );          
        addEdge ( vArray[18], vArray[17] );          
        
        addEdge ( vArray[19], vArray[14] );        
        addEdge ( vArray[19], vArray[15] );          
        addEdge ( vArray[19], vArray[16] );          
        addEdge ( vArray[19], vArray[17] );   
        
        addEdge ( vArray[20], vArray[14] );        
        addEdge ( vArray[20], vArray[15] );          
        addEdge ( vArray[20], vArray[16] );          
        addEdge ( vArray[20], vArray[17] );         
        
        addEdge ( vArray[21], vArray[14] );        
        addEdge ( vArray[21], vArray[15] );          
        addEdge ( vArray[21], vArray[16] );          
        addEdge ( vArray[21], vArray[17] );

        // WIDGET
        addEdge ( vArray[3], vArray[28] );       
        addEdge ( vArray[3], vArray[29] );   
        addEdge ( vArray[3], vArray[30] );           
        addEdge ( vArray[3], vArray[31] );          
        addEdge ( vArray[3], vArray[32] );           
        addEdge ( vArray[3], vArray[33] );          
        
        addEdge ( vArray[28], vArray[22] );       
        addEdge ( vArray[28], vArray[23] ); 
        addEdge ( vArray[28], vArray[24] );       
        addEdge ( vArray[28], vArray[25] );       
        addEdge ( vArray[28], vArray[26] );       
        addEdge ( vArray[28], vArray[27] );       
        
        addEdge ( vArray[29], vArray[22] );       
        addEdge ( vArray[29], vArray[23] ); 
        addEdge ( vArray[29], vArray[24] );       
        addEdge ( vArray[29], vArray[25] );       
        addEdge ( vArray[29], vArray[26] );       
        addEdge ( vArray[29], vArray[27] );        
        
        addEdge ( vArray[30], vArray[22] );       
        addEdge ( vArray[30], vArray[23] ); 
        addEdge ( vArray[30], vArray[24] );       
        addEdge ( vArray[30], vArray[25] );       
        addEdge ( vArray[30], vArray[26] );       
        addEdge ( vArray[30], vArray[27] ); 
        
        addEdge ( vArray[31], vArray[22] );       
        addEdge ( vArray[31], vArray[23] ); 
        addEdge ( vArray[31], vArray[24] );       
        addEdge ( vArray[31], vArray[25] );       
        addEdge ( vArray[31], vArray[26] );       
        addEdge ( vArray[31], vArray[27] );        
        
        addEdge ( vArray[32], vArray[22] );       
        addEdge ( vArray[32], vArray[23] ); 
        addEdge ( vArray[32], vArray[24] );       
        addEdge ( vArray[32], vArray[25] );       
        addEdge ( vArray[32], vArray[26] );       
        addEdge ( vArray[32], vArray[27] );        
        
        addEdge ( vArray[33], vArray[22] );       
        addEdge ( vArray[33], vArray[23] ); 
        addEdge ( vArray[33], vArray[24] );       
        addEdge ( vArray[33], vArray[25] );       
        addEdge ( vArray[33], vArray[26] );       
        addEdge ( vArray[33], vArray[27] );   
        
        // change the order of the adjacency lists, to
        // impact how the DFS traverses the graph
        g.removeVertex( vArray[0] );
        Vertex newV0 = g.insertVertex ( new Point2D.Double ( 0.90, 0.50 ) );  // this is Vertex 0
        newV0.put ( GraphAlgorithm.NAME, "" + 0 );
        addEdge ( newV0, vArray[1] );  
   }
   
    private void addEdge ( Vertex vi, Vertex vj ) 
    {
        Point2D p1 =  (Point2D) vi.element();
        Point2D p2 =  (Point2D) vj.element();

        double distance = Math.sqrt(   (p1.getX() - p2.getX())*(p1.getX() - p2.getX())  +
                (p1.getY() - p2.getY())*(p1.getY() - p2.getY())  ); 
        g.insertEdge( vi, vj, distance );      
    }
    
   public AdjacencyListGraph<Point2D.Double, Double> getSampleGraph( )
   {
       return ( g );
   } 
}
