
#### INTRODUCTION TO COMPUTER GRAPHICS

#### USES
- computer aided design
	- autocad
- Presentation Graphics
	- graphics that are normally used  for presentations
- computer art
	- write  what u know
- entertainment
	- cgi
	- game
	- movies
	- television
	- applications
	- netflix
- education and training
	- flight simulation
- scientific visualisation
	- molecular visualisation
	- weather
	- geography
	- physica
	- maths
- image processing
	- opencv 
	- medical imagery
	- editing
- GUI
	- write what u know
- DTP desktop publising
	- DTP software allows you to create documents with a layout that combines text, images, and graphics. You can format fonts, arrange elements on the page, and ensure everything looks polished and ready for printing or digital distribution.



#### BASIC CONCEPTS
- pixel
	- smallest unit of picture or smallest part or representation of a picture
	- pixel -> picture element like mosaic all form to form one
- frame buffer
	- portion of the memory holding the complete bit map image before its being sent it to the monitor
	- if it is 1 bit / pixel it is called bitmap
	- if it is more than 1 bit per pixel it is called pixmap



#### RASTER AND RANDOM SCAN DISPLAYS
- Raster
	- an electron beam is swept across the screen illuminating some pixels giving it a pattern hence forming a page
	- composed of pixels
	- bitmap images
	- crt, lcd led most modern computer output devices use raster
	- ##### ELECTRON BEAM IN RASTER SCAN DISPLAYS
		- the picture definition is stored in frame buffer
		- each pixels intensity is also stored
		- it takes this info and beam is thrown one row at a time
		- the speed at which blah blah is caled framerate or refresh rate which is normally betwee 60-80hz although newer displays does support 144hz
- Random
	- its essentially drawing the images one line at a time so it is also called random vector displays
	- composed of paths or lines
	- Vector graphics use mathematical relationships between points and the paths connecting them to describe an image
	- vector graphics are composed of path
	- #### ELECTRON BEAM IN RANDOM SCAN
		- picture definition is stored as line drawing commands in refresh buffer or frame buffer
		- designed to draw all component lines 30-60 times each second
		- example
			- pen plotter


#### CRT MONITOR
- CATHODE RAY TUBE
- components
	- phospor screen
		- coated with phosphor different phospors emit different types of color
	- electron gun
		- electron gun is powered by cathode which is heated to produce electrones
	- heated metal cathode
	- **Control Circuitry**: The intensity and position of the electron beam are controlled by the monitor's control circuitry, which interprets signals from the computer's graphics card to determine what should be displayed on the screen.
	- accelerating anode
		- these are positively charged that helps the electron to move towards the screen
	- focusing system
	- deflection system
		- beam of electrons passes through a pair of electromagnets called deflection system these can move vertically and horizontally
	- the electron beam scans the screen in pattern called as raster scan


#### ELECTRON GUN
- cathode- thermionic emission -> heated filament
- electron beam formation- emitted electrons form a cloud around cathode starting point
- grids - control flow of elextrons
- A high positive voltage accelerates the free, negatively charged electrons towards the phosphor coating •
- A high negative voltage applied to the control grid will shut off the beam by repelling electrons •
- A smaller negative voltage on the control grid simply decreases the no of electrons passing through.
- •We control the brightness of a display by varying the voltage on the control grid.
#### ACCELERATING ANODE
- primary function is to accelerate electrons to the screen
- it has positive electric potential to create attraction
- magnitude of attraction acceleration depends on the strength of the electric field
- 

#### DEFLECTION SYSTEM
The deflection system in a CRT consists of electromagnetic coils that generate magnetic fields. By varying the current passing through these coils, the strength and direction of the magnetic fields can be adjusted. These magnetic fields deflect the electron beam horizontally and vertically, scanning it across the screen in a controlled manner. This controlled movement enables the electron beam to trace out the desired image, line by line, resulting in the formation of a complete picture on the CRT screen.
- elecrostatic deflection - write what u know

#### FOCUSING SYSTEM
The focusing system in a CRT typically consists of a focusing electrode or a series of focusing electrodes. These electrodes generate an electric field that converges the electrons emitted from the cathode into a narrow, well-defined beam. By adjusting the voltage applied to the focusing electrodes, the strength of the electric field can be controlled, allowing for precise adjustment of the focus of the electron beam. This ensures that the electron beam remains tightly focused as it scans across the screen, resulting in sharp and clear images displayed on the CRT screen.
- electrostatic focusing
	- electron beam passes through a positively charged metal cylinder to form a electrostatic lens
- magnetic focusing
	- just write what u know

#### PHOSPHOR SCREEN
- persistence
	- the amount of time it takes for the emitted light to decay into one tenth of its intensity
	- lower persistance means higherr refresh rates
	- low persistence phosporos for animations and
	- high persistence phosphors for highly complex static pictures
	- The maximum number of points that can be displayed without overlap on a CRT is referred to as the **resolution**.
	-   **Aspect ratio** is a measure of the proportional relationship between the width and height of an image or display area. It is typically expressed as a ratio of the width to the height. For example, an aspect ratio of 16:9 means that for every 16 units of width, there are 9 units of height.



#### COLOR CRT MONITORS
- method for producing color crt monitors is called beam penetration method
- crt monitors display color using different colored phosphors
- by combining light from these phosphors we can display variety of colors
- 2 techniques to produce color in crt
	- ##### BEAM PENETRATION METHOD
		- used with random scan monitors
		- multilayered phosporos
		- it achieves by modulating acceleration of the electron beams
		- essentially how far the beam would penetrate
		- low potention -> e -> red
		- high potential -> e -> green
		- if an electron has intermediate position and velocity then it creates orange and yellow
	- ##### SHADOW MASK METHOD
		- used in raster scan displays
		- each pixel has a rgb phosphor
		- there are three electron guns one for each pixel
		- it can be used to produce variety of colors
		- there is a shadow mask between electron gun and phosphor screen to ensure that only one electron reaches the screen to avoid overlap
		- 2 types of arrangement 
		- ##### INLINE METHOD
			- arranged in a straight line
			- high res crt
			- 
		- ##### DELTA DELTA METHOD
			- rgb is arranged as a delta in triangle shape where each corner is r g and b respectively then blah blah
			- white or gray area is due to activating all three dots with equal intensity
			- black is produced with zero intensity
			- 8 colors
#### FLAT PANEL DISPLAYS
- just write appearence first
- ##### EMISSIVE
	- emissive displays are those that convert electrical energy to light
	- led, plasma panel
- ##### NON EMISSIVE
	- it used optical effects to convert sunlight or light from some other source into graphics
	- ex : lcd

#### PLASMA PANEL DISPLAYS
- also called gas discharge displays
- usually constructed by filling the area between two glass plates the gas may be neon
- firing voltages applied to horizontal and vertical conductors cause the gas at the intersection to break down into plasma of electrons and ions
- picture definition is refresh buffer

#### LED  LIGHT EMITTING DIODES
- matrix of diodes to form pixel
- picture definition is stored in the refresh buffer and read into the display by using varying voltages 
- there are two types
- edge lit
- direct lit

#### LCD LIQUID CRYSTAL DISPLAY
- it is a non emissive display that shows pictures by passing a polairizing light either from a neighbouring light or internal light sources through liquid crystal meterial that can either block or transmit light
- liquid crystal means they crystal form of molecular arrangement yet they flow like liquid
- commonly use thread like liquid crystal compounds

#### STRUCTURE
- two glass plates containing the light polarizer at right angle sandwiches the liquid crystal
- horizontal conductors in one and vertical conductors in another
- the intersection of two conductors defines a pixel

#### WORKING
- polarized light passing through the material is twisted so it passes through the opposite polarizer
- the light is then reflected back to the viewer
- to turf off pixel we apply voltage to intersecting conductors so that the light is not twisted
- passive maatrix lcd 
- colors can be displayed using different materials dyes or putting different colored pixel at each screen location
- another method is to place a transistor at each pixel using thin film transistor techology
- we vary voltage to get appro color also prevent charge from leaking
- these devices are also called active matrix displays
- 
 
