var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "6",
        "ok": "6",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "134",
        "ok": "134",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "1263",
        "ok": "1263",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "327",
        "ok": "327",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "419",
        "ok": "419",
        "ko": "-"
    },
    "percentiles1": {
        "total": "137",
        "ok": "137",
        "ko": "-"
    },
    "percentiles2": {
        "total": "151",
        "ok": "151",
        "ko": "-"
    },
    "percentiles3": {
        "total": "986",
        "ok": "986",
        "ko": "-"
    },
    "percentiles4": {
        "total": "1208",
        "ok": "1208",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 5,
    "percentage": 83
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 1,
    "percentage": 17
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.667",
        "ok": "0.667",
        "ko": "-"
    }
},
contents: {
"req_goto---page--31218": {
        type: "REQUEST",
        name: "Goto #{page}",
path: "Goto #{page}",
pathFormatted: "req_goto---page--31218",
stats: {
    "name": "Goto #{page}",
    "numberOfRequests": {
        "total": "3",
        "ok": "3",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "134",
        "ok": "134",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "1263",
        "ok": "1263",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "511",
        "ok": "511",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "532",
        "ok": "532",
        "ko": "-"
    },
    "percentiles1": {
        "total": "135",
        "ok": "135",
        "ko": "-"
    },
    "percentiles2": {
        "total": "699",
        "ok": "699",
        "ko": "-"
    },
    "percentiles3": {
        "total": "1150",
        "ok": "1150",
        "ko": "-"
    },
    "percentiles4": {
        "total": "1240",
        "ok": "1240",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 2,
    "percentage": 67
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 1,
    "percentage": 33
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.333",
        "ok": "0.333",
        "ko": "-"
    }
}
    },"req_goto---page--re-0f9bf": {
        type: "REQUEST",
        name: "Goto #{page} Redirect 1",
path: "Goto #{page} Redirect 1",
pathFormatted: "req_goto---page--re-0f9bf",
stats: {
    "name": "Goto #{page} Redirect 1",
    "numberOfRequests": {
        "total": "3",
        "ok": "3",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "136",
        "ok": "136",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "155",
        "ok": "155",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "143",
        "ok": "143",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "9",
        "ok": "9",
        "ko": "-"
    },
    "percentiles1": {
        "total": "137",
        "ok": "137",
        "ko": "-"
    },
    "percentiles2": {
        "total": "146",
        "ok": "146",
        "ko": "-"
    },
    "percentiles3": {
        "total": "153",
        "ok": "153",
        "ko": "-"
    },
    "percentiles4": {
        "total": "155",
        "ok": "155",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 3,
    "percentage": 100
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.333",
        "ok": "0.333",
        "ko": "-"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
