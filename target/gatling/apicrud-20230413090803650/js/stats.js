var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "23",
        "ok": "23",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "157",
        "ok": "157",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "403",
        "ok": "403",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "182",
        "ok": "182",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "50",
        "ok": "50",
        "ko": "-"
    },
    "percentiles1": {
        "total": "167",
        "ok": "167",
        "ko": "-"
    },
    "percentiles2": {
        "total": "174",
        "ok": "174",
        "ko": "-"
    },
    "percentiles3": {
        "total": "218",
        "ok": "218",
        "ko": "-"
    },
    "percentiles4": {
        "total": "362",
        "ok": "362",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 23,
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
        "total": "2.091",
        "ok": "2.091",
        "ko": "-"
    }
},
contents: {
"req_update-user-req-0416c": {
        type: "REQUEST",
        name: "Update User Request",
path: "Update User Request",
pathFormatted: "req_update-user-req-0416c",
stats: {
    "name": "Update User Request",
    "numberOfRequests": {
        "total": "8",
        "ok": "8",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "159",
        "ok": "159",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "213",
        "ok": "213",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "173",
        "ok": "173",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "16",
        "ok": "16",
        "ko": "-"
    },
    "percentiles1": {
        "total": "168",
        "ok": "168",
        "ko": "-"
    },
    "percentiles2": {
        "total": "172",
        "ok": "172",
        "ko": "-"
    },
    "percentiles3": {
        "total": "202",
        "ok": "202",
        "ko": "-"
    },
    "percentiles4": {
        "total": "211",
        "ok": "211",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 8,
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
        "total": "0.727",
        "ok": "0.727",
        "ko": "-"
    }
}
    },"req_create-user-req-b03b0": {
        type: "REQUEST",
        name: "Create User Request",
path: "Create User Request",
pathFormatted: "req_create-user-req-b03b0",
stats: {
    "name": "Create User Request",
    "numberOfRequests": {
        "total": "15",
        "ok": "15",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "157",
        "ok": "157",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "403",
        "ok": "403",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "186",
        "ok": "186",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "60",
        "ok": "60",
        "ko": "-"
    },
    "percentiles1": {
        "total": "166",
        "ok": "166",
        "ko": "-"
    },
    "percentiles2": {
        "total": "174",
        "ok": "174",
        "ko": "-"
    },
    "percentiles3": {
        "total": "273",
        "ok": "273",
        "ko": "-"
    },
    "percentiles4": {
        "total": "377",
        "ok": "377",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 15,
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
        "total": "1.364",
        "ok": "1.364",
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
