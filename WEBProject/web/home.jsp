

<%@page contentType="text/html" pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html lang="en">
<head>
   
    <title>Food Store</title>
    <style>
        /* CSS for styling the photo gallery */
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
              text-align:  center;
        }
        
        header {
            text-align: center;
            background-color:black;
            color: white;
            padding: 10px;
            border-radius: 10px;
        }
         .btn {
                display: inline-block;
                padding: 10px 20px;
                background-color:black;
                color:blanchedalmond;
                border-radius: 5px;
                font-size: 18px;
                transition: background-color 0.3s ease;
                text-align:  center;
            }
        
        .container {
            max-width: 100%;
            margin: 0 auto;
            padding: 20px;
            display: flex;
            flex-wrap: wrap;
            gap: 10px; /* Add some space between photos */
        }
        
        .photo {
            flex: 1; /* Distribute available space evenly among photos */
            background-color: #fff;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            border-radius: 5px;
            overflow: hidden;
            display: flex;
            flex-direction: column; /* Place description below the image */
        }
        
        .photo img {
            width: 100%;
            height: auto;
        }
        
        .photo .description {
            padding: 10px;
        }
        
        label {
    display: block;
    margin-bottom: 0.5rem;
    font-weight: bold;
}

        
        textarea {
    width: 100%;
   padding: 0.1rem;
    margin-bottom: 0.2rem;
    border: 2px black inset;
    border-radius: 3px;
    font-size: 19px;
    font-style:oblique;
}



    </style>
</head>

<body background="Navy-Blue-Background1s-Free.png">
    
    <header>
        <h1>Food Store</h1>
    </header>
    
    <div class="container">
        <div class="photo">
            <img src="funky fries.png" alt="Photo 1">
            <div class="description">
                <h2>Funky Fries</h2>
                <p>Take 2 fries together and use any wooden stick around them.
                Cut in straight way and then from the other side cut diagonally.</p>
                <label for="ingredients">Ingredients:</label>
                <textarea>
                    Fries Masala:-         
                    Pizza Seasoning-2tbsp
                    Garlic and Onion Powder-2 tbsp
                    Powdered Sugar-1 tbsp
                    RedChilli Powder-1 tbsp
                    Chaat Masala- 1 tbsp
                </textarea>
                <p>
                    
                </p>
            </div>
     </div>
        
        <div class="photo">
            <img src="Cajun Potatoes.png" alt="Photo 2">
            <div class="description">
                <h2>Cajun Potatoes</h2>
                <p>Boil some potatoes and make small tikkies with it.Then dip the
                tikkies in Crispy Batter and shallow fry it.Enjoy the Cajun Potatoes with 
                Cajun Sauce.</p>
                <label for="ingredients">Ingredients:</label>
                <textarea>
                    Crispy Batter:-       
                    Maida-1/2 Cup
                    CornFlour-1/4 Cup
                    Salt-1/2 tbsp
                    Water-As per required             
                </textarea>
                 <textarea>
                    Cajun Sauce:-       
                    RedChilli Powder-1/2 tbsp
                    RedChilli Sauce-15 ml
                    Mayonnaise-3 tbsp
                    Chopped Onion-2 tbsp
                    Black Pepper Powder-1/2 tbsp
                    Salt-1/2 tbsp
                    Milk-75 ml             
                </textarea>
            </div>
        </div>
        
        <div class="photo">
            <img src="Paneer Cheese Wrap.png" alt="Photo 3">
            <div class="description">
                <h2>Paneer Cheese Wrap</h2>
                <p>Cut the bread into three slices and put paneer pieces in between 
                of them and attach them with a stick.Now take some butter,sauce,spices and oregano
                and cook the sticked paneer wrap.After that cook some different kind of cheese in
                a pan until it melt then roll our wrap in it cover it sides and Paneer Cheese Wrap
                is ready.</p>
                 <label for="ingredients">Ingredients:</label>
                <textarea>
                  Bread-2 Slices
                  Paneer-2 Slices(Same Size as Bread)
                  Tomato Sauce-1 tbsp
                  Oregano-1/2 tbsp
                  Chilli Sauce-1 tbsp
                  Butter-4 tbsp
                  Black Pepper-1 tbsp
                  Mozrella Cheese-2 tbsp
                  Cheese-2tbsp
            
                </textarea>
            </div>
        </div>
        
         <div class="photo">
            <img src="potato garlic rings.png" alt="Photo 3">
            <div class="description">
                <h2>Potato Garlic Rings</h2>
                <p>Saute Butter and Minced Garlic for some minutes then add water
                ,salt,flour cook on low flame till it matches the consistency of a dough
                Now add cornstarch on mashed potatoes and add mixed herbs in it.Then
                roll out the dough and make rings out of it then cut further more ring from it
                and airfry it.</p>
                  <label for="ingredients">Ingredients:</label>
                <textarea>
                  Butter-2tbsp
                  Minced Garlic-2tbsp
                  Salt-1/4 tbsp
                  Water-1/4 Cup
                  All-Purpose Flour-4 tbsp
                  Boiled and Mashed Potatoes-4
                  CornStarch-4 tbsp
                  Mixed Herbs-1 tbsp
            
                </textarea>
            </div>
        </div>
        
         <div class="photo">
            <img src="Chocolate Truffle.png" alt="Photo 3">
            <div class="description">
                <h2>Chocolate Truffle</h2>
                <p>Melt butter and mix cocoa,condensed milk,salt.Keep stirring on low
                heat.Keep cooking till it thickens a bit.Now,transfer it to a plate and
                let it coll little,cling wrap and chill for 2-3 hours.Grease hands with
                butter.Scoop a small portion and shape it into a ball.Roll the fudgy
                balls in chocolate sprinkles or chopped nuts and Enjoy.</p>
                  <label for="ingredients">Ingredients:</label>
                <textarea>
                  Condensed Milk-1 Can(400gm)
                  Cocoa Powder-1/4 Cup(30gm)
                  Butter-1 tbsp
                  Salt-1/2 tbsp
                  Sprincles/Chocochips-1 Cup
            
                </textarea>
            </div>
        </div>
        
         <div class="photo">
            <img src="Rava Dosa.png" alt="Photo 3">
            <div class="description">
                <h2>Rava Dosa</h2>
                <p>Mix some rawa,rice flour and maida.Then add some curd and water and 
                whisk it altogether.Then add some salt,green chillies,cumin,coriander,onion
                ,ginger,pepper and mix it.Then rest it for about 20 min.Throw it in a hot 
                pan add some oil and cook it till its nice and crispy.</p>
                  <label for="ingredients">Ingredients:</label>
                <textarea>
                  Rava-1/2 Cup
                  Rice Flour-1/2 Cup
                  Maida-1/4 Cup
                  Curd-1 tbsp
                  Water-2 and 1/2 Cup
                  Salt-1 tbsp
                  Green Chillies-2 (finely chopped)
                  Cumin-1/2 tbsp
                  Coriander-1 tbsp(finely chopped)
                  Onion-1 (finely chopped)
                  Ginger-1/2 tbsp(grated)
                  Oil-for frying 
            
                </textarea>
            </div>
        </div>
        
    </div>
    
     <div class="container">
        <div class="photo">
            <img src="Wheat Pizza.png" alt="Photo 1">
            <div class="description">
                <h2>Wheat Pizza</h2>
                <p>Create a dough for the pizza base.Kept it for 15-20 minutes then 
                    the dough is ready for making Pizza.First some pizza sauce then cheese then 
                some sauted vegetables again some cheese.Now cook it in pan for atleast 15-20 min in low flame.</p>
                  <label for="ingredients">Ingredients:</label>
                <textarea>
                  Dough:-
                  Baking Powder-1/2 tbsp
                  Baking Soda-1/4 tbsp
                  Brown Sugar-1 tbsp
                  Wheat Flour-1 Cup
                  Salt-1/4 tbsp
                  Oil-1 tbsp
                  Oregano-1/4 tbsp
                  Curd-As per needed to knead it
            
                </textarea>
            </div>
     </div>
        
        <div class="photo">
            <img src="Cheesy potato nuggets.png" alt="Photo 2">
            <div class="description">
                <h2>Potato Cheese Starters</h2>
                <p>In mashed potatoes add some corn starch,bread crumbs and veggies.
                Then add mozrella cheese, black pepper and salt ,mix it well and make a shape
                of ball.Then dip these balls into Batter,cover it with bread crumbs and fry it.
                Then enjoy it with the Sauce.</p>
                  <label for="ingredients">Ingredients:</label>
                <textarea>
                  Batter:-
                  CornFlour-1/4 Cup
                  Maida-1/4 Cup
                  Oil-For frying
                </textarea>
                  <textarea>
                      Mashed Potatoes-5 to 10
                      Corn Starch-1 to 2 Cup
                      Bread Crumbs-2 bread
                      Onion-1 (finely chopped)
                      Capsicum-1 (finely chopped)
                      Carrot-1 (finely chopped)
                      Green Chillies-3 (finely chopped)
                      Cheese-many cubes
                      Salt-1 tbsp
                      Black Pepper-1/2 tbsp
                  </textarea>
                  <textarea>
                      Sauce:-
                      Mayonnaise-2 tbsp
                      Tomato Ketchup-3 tbsp
                      Black Pepper-1 tbsp
                      Chilli Flakes-1 tbsp
                      Oregano-1 tbsp
                      Garlic Powder-1 tbsp

                  </textarea>
            </div>
        </div>
        
        <div class="photo">
            <img src="Korean chilli garlic .png" alt="Photo 3">
            <div class="description">
                <h2>Korean Chilli Garlic Potato</h2>
                <p>Mash Potatoes with the help of Channi.Then add salt and Cornflour in it 
                and some water for kneading it.Now create the unique shape with the help of
                oil and some bottle.Boil them in steaming hot water for 3 min.After hot water
                put them in complete cold water.Then mix all the ingredients of tempering except
                garlic ,add hot oil and cooked garlic in it.Mix all well together and Enjoy.</p>
                  <label for="ingredients">Ingredients:</label>
                <textarea>
                  Boiled Potatoes-5
                  Salt-3/2 tbsp
                  CornFlour-3/2 Cup        
                </textarea>
                   <textarea>
                  For Tempering:-
                  Red Chilli-2 tbsp
                  Soya Sauce-2tbsp
                  Sugar-2 tbsp
                  Spring Onion-2 tbsp
                  Oil-2-3 tbsp
                  Garlic-2 tbsp
         
                </textarea>
            </div>
        </div>
        
         <div class="photo">
            <img src="Silky cheese corn toast.png" alt="Photo 3">
            <div class="description">
                <h2>Silky Cheese Corn Toast</h2>
                <p>Prepare the cheese corn mix ,apply it on the slice of bread.
                Top with the slice of cheese.Bake or cook on a pan and enjoy warm.</p>
                  <label for="ingredients">Ingredients:</label>
                <textarea>
                  Chhese Corn Mix:-
                    Boiled Corn-2 tbsp
                    Mayonnaise-1 tbsp
                    Mozrella Cheese-1 tbsp
                    Salt-1 tbsp
                    Pepper-1 tbsp
                </textarea>
                  <textarea>
                      The Toast:-
                        Bread-1 Slice
                        Cheese Slice-1
                        Mozrella Cheese-1 tbsp
                        Mixed Herbs-1 tbsp
                        Chilli Flakes-1 tbsp
                  </textarea>
            </div>
        </div>
        
         <div class="photo">
            <img src="Masala Lacha Paratha.png" alt="Photo 3">
            <div class="description">
                <h2>Masala Lachaa Paratha</h2>
                <p> Take 5 flour,add oil,red chilli powder,jeera powder,garam masala
                ,salt and spring onion.Then cut it into stripes and create a rose from it.
                Now,make a paratha and cook it.</p>
                  <label for="ingredients">Ingredients:</label>
                <textarea>
                  Oil-1 tbsp
                  Red Chilli Powder-1 tbsp
                  Jeera Powder-1/2 tbsp
                  Garam Masala-1/4 tbsp
                  Salt-1 tbsp
                  Spring Onion-1 to 2 tbsp
                  Seasame Seeds-1 tbsp
            
                </textarea>
            </div>
        </div>
        
         <div class="photo">
            <img src="Chilli Cheese Potatoes.png" alt="Photo 3">
            <div class="description">
                <h2>Cheesy Masala Potatoes</h2>
                <p>Shallow fry some baby potatoes, add turmeric,cumin powder, chilli powder,
                salt, pepper and some cheese.Cook for some time and Enjoy.</p>
                  <label for="ingredients">Ingredients:</label>
                <textarea>
                  Oil-3 tbsp
                  Boiled baby Potatoes-20 to 25
                  Turmeric-1/4 tbsp
                  Cumin Powder-1 tbsp
                  Red Chilli Powder-1 tbsp
                  Salt-1 tbsp
                  Pepper-1 tbsp
                  Cheese-As per required
                  Mixed Herbs-1 tbsp
                  Chilli Flakes-1 tbsp
            
                </textarea>
            </div>
        </div>
        
    </div>
      <a href="Feedback.jsp" class="btn">Food Store Feedback</a>
        
</body>

</html>
