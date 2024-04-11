- geometric tranformations
- translation
	- change in position linear
- rotation
	- change in orientation circular
- scaling
	- change in size
- reflection
	- mirror image
- shearing
	- distortion


#### TRANSLATION
- rigid body transformation
- we have to supply tx,ty
- we increment x and y with these
- $\mathbf{x}' = \mathbf{x} + \mathbf{T}$

#### SCALING
change in size 
- uniform scaling 
- differential scaling
#### ROTATION
along circular path defining parameter $\theta$
$+ve$ means anti clockwise
$-ve$ clock wise
pivot point 
- the point at about the object is rotated
- rotation wrt origin $(0,0)$
- learn more about rotation
- rotation w.r.t fixed point

#### HOMOGENOUS CORDINATE REPRESENTATION OF GEOMETRIC TRANSFORMATIONS

- it is hard to display 3d objects on 2d screen
- so homogenous cordinates aids in this
- 
learn all the equations by heart at last
#### REFLECTION IN COMPUTER GRAPHICS
- reflection rotates the image by 180 degrees gives mirror image of the object wrt the x axis of reflection
- reflection about the x axis
	- 
- reflection about the y axis
- reflection with respect to xy-plane
- reflection wrt y=x diagonal
	- 

#### SHEAR 
A transformation that distorts the shape of an object
- x directional shear
- y directional shear


#### WINDOW TO VIEWPORT TRANSFORMATION

- window means entire scene or image that we want to display
- viewport means portion of the screen that we want to show the scene
- transformation
- scaling and translation
- clipping
	- if any part of the window extends beyond the boundaries of the viewport it is clipped essentially

	- process of eliminating the portions outside the window is called clipping
	- w.r.t window
		- clip while selecting window
	- w.r.t viewport
		- clip while saving the image to viewport

#### CLIPPING
- point clipping 
	- sued to check if certain point falls outside the window
	- blah blah
	- 
- line clipping
	- checks if a line segment in visible inside the window otherwise it clips
	- if both end points of a line segment are inside the window it is kept inside
	- if the only one end point of a line segment is outside the window then the part outside is clipped if 
	- if both end points of a line segment are outside then entire line is ignored essentially
- polygon clipping
	- - The vertices of the polygon are checked against the boundaries of the clipping region to determine if they lie inside, outside, or intersect the region.
- Vertices that lie entirely within the clipping region are retained for rendering.
- If a vertex lies outside the clipping region, it is discarded, and the edges of the polygon that intersect the clipping region boundaries are clipped or trimmed to the intersection points.
- The resulting clipped polygon, which may be a smaller polygon or a fragment of the original polygon, is retained for rendering.
- essetially here it is checked whether the the polygon is inside the window or not if it is inside the window it is kept if it is outside the window then it is clipped




#### COHEN SUTHERLAND LINE CLIPPING
- write about what line clipping is 
- all stuff and that all
- the window is divided into top bottom right and left and given area code
- the line is then checked against to see if it is inside 
- there is three
- partially inside
- perfectly outside
- and perfectly inside
- learn how to do atlast

#### SUTHERLAND AND HODGEMAN POLYGON CLIPPING
- write about what is polygon clipping
- four stages
- left clip
- right clip
- top clip
- bottom clip
- if a line segment connecting two vertices are inside the window keep
- if a iine segment connecting two vertices are outside the window then we determine the intersection point and then we clip it


#### COLOR MODELS
- RGB
	- additive aanu
	- red + green = yello
	- green+blue cyan
	- red +blue magenta
	- 0 to 255
- YIQ
	- The YIQ color model, integral to NTSC television broadcasting, operates on the premise of segregating luminance (Y) from chrominance (IQ). This division allows for a nuanced representation of color and brightness within television signals. The luminance component (Y) denotes the intensity or brightness of the image, ranging from 0 (black) to 1 (white). In contrast, the chrominance components (I and Q) capture the color information along orthogonal axes: I represents the orange-blue axis, while Q denotes the purple-green axis. Through a weighted transformation from the RGB color space, YIQ efficiently conveys color and luminance details, optimizing signal transmission and compression. Though predominantly utilized in analog television systems, its legacy endures in contemporary broadcasting technologies, facilitating the faithful transmission of color-rich images to viewers worldwide.
- CMY
	- The CMY color model, standing for Cyan, Magenta, and Yellow, is fundamental to color reproduction in various printing processes. Unlike additive color models like RGB, which involve mixing light, CMY is subtractive, involving the absorption of light. In this model, colors are created by subtracting varying degrees of cyan, magenta, and yellow from white light. When combined at maximum intensity, these pigments theoretically absorb all colors, resulting in black.

		Each primary color in the CMY model corresponds to a pigment that absorbs one of the primary colors of light. Cyan absorbs red light, magenta absorbs green light, and yellow absorbs blue light. By selectively subtracting these primary colors, a wide spectrum of hues can be achieved, making CMY suitable for color printing.
		
		To extend its range and improve color accuracy, the CMY model is often augmented with a fourth color, black (CMYK), which is used to improve the reproduction of dark colors and to save ink. This addition allows for more precise control over color mixing and enhances the depth and richness of printed images.
		
		CMY-based printing technologies, such as inkjet and color laser printers, rely on this model to reproduce images with vibrant and accurate colors. From magazines and posters to packaging and photographs, the CMY color model underpins the modern printing industry, enabling the production of visually stunning and high-quality printed materials.






#### HSB AND HLS color model
##### HSB
- hue 
- saturation 
- brighntess
##### HLS
- hue
- lightness
- saturation
- 
#### COMPOSITE TRANFORMATION
- multiple transformations into a single matrix

#### RGB TO YIQ COLOR MODEL
#### PURITY BRIGHTNESS AND LUMINANCE OF LIGHT

- purity
	- saturation means intensity or vibrancy of color
- brightness
	- percieved lightness or darkness of colors if it is emitted or absorbed if it is lightness or darkness
- luminance
	- luminance is the measure of brightness of a light source or object
	- Luminance is a measure of the brightness of a light source or an illuminated surface. It quantifies the amount of light emitted, reflected, or transmitted by an object and is typically expressed in units such as candelas per square meter (cd/m²). Luminance is essential for understanding the brightness of objects in real-world scenes and is often used in lighting design, display technology, and photography to achieve desired levels of illumination and visual comfort.


#### DVST direct view storage tube
 It is a CRT with a long persistence phosphor. 
 Provides flicker free display. 
 An alternative method for maintaining a screen image is to store the picture information inside the CRT instead of refreshing the screen. 
 A direct-view storage tube (DVST) stores the picture information as a charge distribution just behind the phosphorcoated screen.(ie. On storage grid)  Two electron guns are used in a DVST. 
 One, the primary gun(storage grid), is used to store the picture pattern; 
 the second, the flood gun, maintains the picture display.




#### GIMP
gnu image manipulation program
github