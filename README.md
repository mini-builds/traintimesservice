# National Rail Enquiries Departure Board

Wrapper around the National Rail Enquiries API to request departure board information.

## Usage

```java
TrainTimesService service = new NRETrainTimeService("api-token");
List<TrainService> trainServices = service.getTrainServices("RDG", "BSK") 
```

The returned list will look like:

```json
[
    {
        "time": "14:12",
        "expectedTime": "On time",
        "callingPoints": [
        {
            "location": "Basingstoke",
            "time": "14:30",
            "expectedTime": "On time"
        },
        ...,
        {
            "location": "Salisbury",
            "time": "15:14",
            "expectedTime": "On time"
        }
      ]
    },
    ...
]
```
