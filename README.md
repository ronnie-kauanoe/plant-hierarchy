# Modeling Hawaiian Plants as a Java Class Heirarchy for Aina-Based Learning
#### Advising Faculty: Lisa Miller | Student: Ronnie Kaunaoe

<img class="ui image" src="uml.jpg">

## Purpose

This repository contains the files made for my STEM Research Experience in Computer Science (SCI 295CS) course taught by Professor Lisa Miller at Kapiolani Community College in Spring 2019. The project's goal was to model native Hawaiian plants as Java classes and create a graphical user interface (GUI) to display at the end of the semester. 

## Development

At the beginning of the semester, I met with Mike Ross, a botany professor at Kapiolani Community College, who provided a list of six plant families and three plants from each family. At the time of creating this repository, 16 of the 18 plants can be found on campus. 

Next, I researched common attributes between them (common name, scientific name, origin, etc.) to create an abstract Plant superclass, its abstract plant family children, and its non-abstract individual plant grandchildren. The superclass and plant family classes are abstract to disallow the instantiatization of a Plant or plant family object. Alongside this, I also researched the plant types (tree, shrub, etc.), which would be implemented as interfaces by the individual plants. I then created a Unified Modeling Language (UML) class diagram to visualize the class structure. This diagram can be seen above and a PDF version can be found in the repository. 

Then, I used the general location of the plants given by Mike Ross and walked around campus to find their exact locations. When I found a plant, I used Google Maps and recorded the langitude and longitude of the plant's location, which would be used to create the individual plant classes.

After this, I wrote the Plant superclass. This contains its constructor, accessor, and mutator methods. From this, I created the family classes, which only had a constructor filled with the appropriate common name, scientific name, family genera count, and family species count. I then wrote the six plant type interfaces and three plant classes for each family and implemented the appropriate interface.

Finally, I created a GUI for to demonstrate using these classes. The GUI contains four columns. The first contains six "card" that hold a families' plant buttons. The second is an image of the corresponding family class and plant classes taken from the UML diagram. The third displays an image of the plant and its general information. The fourth shows an image of the plants location on campus and its coordinates if it is found there.

## Future Modifications and Applications

The project can be easily adapted to add even more plants and plant families. Due to time constraints, I could not implement Google Maps directly into the GUI but this functionality can be achieved with JavaScript. Additionally, instead of having a directory with the plant images, a database could be established to retrieve the image when the GUI is rendered. These files can be used to create an in-depth database of plants across multiple families and types. The Plant superclass can be modified to include even more attributes to further define what makes a plant. One potential application could be to construct a virtual garden. 

[INSERT TEXT HERE]

## Plants and Types Modeled

### Legume (_Fabaceae_)

* Koa (_Acacia koa_)
* Oahu Riverhemp (_Sesbania tomentosa_)
* Hawaiian Coral Tree (_Erythrina sandwicensis_)

### Soapberry (_Sapindus_)

* Oahu Soapberry (_Sapindus oahuensis_)
* Hawaiian Soapberry (_Sapindus saponaria_)
* Hopbush (_Dodonaea viscosa_)

### Mallow (_Malvaceae_)

* Hawaiian Red Hibiscus (_Hibiscus kokio_)
* Hawaiian Cotton (_Gossypium tomentosum_)
* Flowering Maple (_Abutilon menziesii_)

### Arum (_Araceae_)

* Taro (_Colocasia esculenta_)
* Giant Elephant Ear (_Alocasia macrorrhiza_)
* Tarovine (_Monstera deliciosa_)

### Mulberry (_Moraceae_)

* Breadfruit (_Atrocarpus altilis_)
* Chinese Banyan (_Ficus microcarpa_)
* Indian Banyan (_Ficus benghalensis_)

### Morning Glory (_Convolvulaceae_)

* Sweet Potato (_Ipomoea batatas_)
* Bayhops (_Ipomoea pes-caprae_)
* Oval-Leaf Clustervine (_Jacquemontia sandwicensis_)

### Types (Interfaces)

* Tree
* Shrub
* Bulb
* Vine
* Evergreen
* Perennial

***Credit to Kapiolani Community College Botany Instructor [Mike Ross](https://www.kapiolani.hawaii.edu/directory/mikeross/), [Native Plants Hawaii](http://nativeplants.hawaii.edu/), [Missouri Botanical Gardens](http://www.missouribotanicalgarden.org/), and [Encyclopedia Britannica](https://www.britannica.com/) for plant information and [Wikimedia Commons](https://commons.wikimedia.org/wiki/Main_Page) for plant images.***
