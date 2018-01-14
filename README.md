# crypto-prices
Backend Code:
* Backend code consists of Spring Boot App, fetching live data from https://www.alphavantage.co website, while historical information is extracted using python script import_dump.py and inserted into elastic search node.

* Each of the crypto types are stored in the individual indices.


![alt text](https://github.com/SuperMohit/crypto-prices/blob/master/elastic.png)

* The Spring Boot App is then Dockerized using Dockerfile format which is available at

https://cloud.docker.com/swarm/mohittalniya/repository/docker/mohittalniya/cryptoapi/general


![alt text](https://github.com/SuperMohit/crypto-prices/blob/master/building.png)



Front End Code:

* Front End code is written in ReactJS.
* recharts library is used for plotting historical price information of cryptos.
* While the card layout displays current pricing of the individual cryptos, clicking the given card provides historical data in the form of line chart,
* Right now the Data has been sliced to 100 dates.

![alt text](https://github.com/SuperMohit/crypto-prices/blob/master/UI.png)

