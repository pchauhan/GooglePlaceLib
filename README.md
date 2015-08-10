#GooglePlaceLib

GooglePlaceLib is an open-source Android library for fetching [Google Places API][1] using simple Asynchtask based API callbacks.

Its Main purpose it to use Google Places API requests with ease in a less lines of code. 

This includes following:

 - [Place Search][2]
     - Nearby Search (search places in a specified area)
     - Text Search (search places based on a search string)
     - Radar Search (Search for up to 200 places)
 - [Place Details][3] (get more comprehensive information about a place)
 - [Place Autocomplete][7]  (Get place predictions based on the search text)
 - [Query Autocomplete][8](Get on-the-fly geographic query predictions)


##How To Use


##Usage

You can take a look at the detailed example usage project .

#### 1. Import Module in workspace

#### 2. Add as Module in project dependancy

#### 3. Implementing interface for callback
```
YourActivity implements Response_Interface 

//you will get callback 
onCompeleteRequest(Response_Object mResponseObject)

```
#### 4. Making a request & get Response
```
RequestParams requestParams = new RequestParams();
requestParams.put(GooglePlace_API_Constant.INPUT, "Your Text");
requestParams.put(GooglePlace_API_Constant.KEY, "Your API Key");
requestParams.put(GooglePlace_API_Constant.LOCATION, latitude + "," + longitude);

// User different method as you want   
GooglePlace_API.GooglePlace_AutoComplete_API(this, requestParams, this, true);
GooglePlace_API.GooglePlace_NearBy_API(this, requestParams, this, true);
GooglePlace_API.GooglePlace_TextSearch_API(this, requestParams, this, true);
GooglePlace_API.GooglePlace_Details_API(this, requestParams, this, true);
GooglePlace_API.GooglePlace_RadarSearch_API(this, requestParams, this, true);
GooglePlace_API.GooglePlace_QueryComplete_API(this, requestParams, this, true);
        
//Finally you will get compelete json object in onCompeleteRequest method.

```        

Please check [Google Places API documentation][1] for request and resonse. you can search all request parameters and get response of all objects mentioned in [Google Places API documentation][1].


##Compatibility

 - Android 2.3.3 +

##TODOs

- Add Example project on how to use this library.



##Contributing and notes

 - If you like this library, please consider giving it a Github star.

Pull requests are very welcome expecting you follow few rules:

 - Document your changes in a code comments and Git commit message
 
## Also you can refere  [iPhone GPlaceAPI][9] 

##License
The MIT License (MIT)

Copyright (c) 2015 Parag Chauhan

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.


  [1]: https://developers.google.com/places/documentation/
  [2]: https://developers.google.com/places/documentation/search
  [3]: https://developers.google.com/places/documentation/details
  [5]: https://developers.google.com/places/documentation/#Authentication
  [7]: https://developers.google.com/places/webservice/autocomplete
  [8]: https://developers.google.com/places/webservice/query
  [9]:  https://github.com/Darshanptl7500/GPlaceAPI
  
