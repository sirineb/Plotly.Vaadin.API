window.org_kopi_plotly_PlotlyChart = function () {
    this.onStateChange = function () {
        // read state
        var domId = this.getState().domId;
        var data = this.getState().data;
        var layout = this.getState().layout;

        // evaluate highcharts JS which needs to define var "options"
        eval(data);
        eval(layout);

        // set chart context
        Plotly.newPlot(domId, data,layout,{displayModeBar: false});
    };
};