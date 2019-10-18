# Lesson_28 Постановка задачи:
Сделать 3 запроса:
1) отправить картинку на сервер в JSON:
описание картинки, например "пейзаж"
сама картинка в формате base64
Сервер должен вернуть ID картинки и сохранить в базу. В оперативной памяти не храним.
2) получить список всех картинок в формате json, без самих картинок, только описание и id
3) получить картинку по id по прямой ссылке

Pictures API
Collection of API endponints used to manipulate pictures stored in the data base

ADD PICTURE
Adding picture in the data base
POST /add/ HTTP/1.1
host:164.68.101.149:12345
Sample Response
HTTP/1.1 200 OK
Content-Type: text/plain
"The picture "flamingo" id - 1"
URL sample
url: http://164.68.101.149:12345/oltym/api/add

GET ALL PICTURE
Obtain list of pictures stored in the data base
GET HTTP/1.1
host:164.68.101.149:12345
Sample Response
HTTP/1.1 200 OK
Content-Type:text/plain
{"id": 1, "description": "flamingo"  }
http://164.68.101.149:12345/oltym/api

GET PICTURE BY ID
Obtain specific picture registered by unique edentifier
GET /bird/ HTTP/1.1
host:164.68.101.149:12345
Sample Response
HTTP/1.1 200 OK
Content-Type:image/jpg
http://164.68.101.149:12345/oltym/api/bird
