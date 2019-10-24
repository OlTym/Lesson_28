## Постановка задачи:
Сделать 3 запроса:<br/>1. Отправить картинку на сервер в JSON:<br/>  - описание картинки, например "пейзаж"<br/>  - сама картинка в формате base64<br/>Сервер должен вернуть ID картинки и сохранить в базу. В оперативной памяти не храним.<br/>
2. Получить список всех картинок в формате json, без самих картинок, только описание и id<br/>3. Получить картинку по id по прямой ссылке

## Pictures API manual
Collection of API endponints used to manipulate pictures stored in the data base
### ADD PICTURE<br/>
Adding picture in the data base<br/>
POST/add/  HTTP/1.1<br/>
**host:** ```164.68.101.149:12345```<br/>

**Sample Response:**<br/>
HTTP/1.1 200OK<br/>
**Content-Type:** text/plain

       The picture "flamingo" id-1<br/>
       
**URL sample:**<br/>
**url:** <http://164.68.101.149:12345/oltym/api/add><br/>

### GET ALL PICTURE<br/>
Obtain list of picture stored in the data base<br/>
GET HTTP/1.1<br/>
**host:** ```164.68.101.149:12345```<br/>

**Sample Response:**<br/>
HTTP/1.1 200OK
**Content-Type:** text/plain

      {"id": 1, "description": "flamingo"}
      
**URL sample:**<br/>
**url:** <http://164.68.101.149:12345/oltym/api>


### GET PICTURE BY ID<br/>
Obtain specific picture registered by unique edentifier<br/>
Get/bird/ HTTP/1.1<br/>
**host:** ```164.68.101.149:12345```

**Sample Response:**<br/>
HTTP/1.1 200OK<br/>
**Content-Type:** image/jpg<br/>

**URL sample:**<br/>
**url:** <http://164.68.101.149:12345/oltym/api/bird><br/>

 
