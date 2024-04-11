
#### SCAN CONVERSION
- input geometry
- discretization
- rasterization
- coloring or rendering
- output

#### TWO TYPES
- scan conversion of line - dda
- scan conversion of circle - bresenhams circle generating algo

#### DDA DIGITAL DIFFERENTIAL ANALYSER

- we take points
- we calculate slope
- if m-> > 0 we increment y otherwise y
- also if incrementing x we put direct m otherwise we put 1/m
- then we go on until we reach end point
- the way we round off is also important
- but for the next calculation we use the unroundede value


#### BRESENHAMS CIRCLE GENERATING ALGORITHM
- used for scan conversion of circle
- 360 degree is divided into 8 octants each of 45 degree
- for first onctant only the rest would be drawn using symmetric property of circle
- numerical problems at last




#### POLYGON FILLING
given vertices and color our aim is to fill the polygon two methods are
- boundary fill method
	- four connected
		- in this method top right left and down is calculated
	- eight connected
		- left right above and below and four diagonals are also considered
		- 
	
- scanline fille fill method
	- write about boundary fill uses lines

#### SCANLINE BOUNDARY FILLING ALGORITHM
- uses horizontal line and fill interior polygon
- it draws horizontal line and intersects edges of a polygon it takes pairs of intersection and fills the area 
- find intersection
- sort intersection
- make pairs and fill
#### SPECIAL CASES
1. If both lines intersecting at the vertex are on the same side of the scanline, consider it as two points.
2. If lines intersecting at the vertex are at opposite sides of the scanline, consider it as only one point.


Figures on a computer screen can be drawn using polygons. To fill those figures with color, we need to develop some algorithm.There are two famous algorithms for this purpose: Boundary fill and Scanline fill algorithms.