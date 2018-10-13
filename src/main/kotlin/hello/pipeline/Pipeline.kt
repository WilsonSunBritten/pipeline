package hello.pipeline

class Pipeline {
    // the basic idea of a pipeline should be an object that has 'named steps' that adhear to an over-arching call style set forth by the pipeline
    // the initial setup should be similar to sci kit learn pipelines.


}

interface PipelineData

open class PipelineStep {
    fun setup(data: PipelineData) {
        // any setup that has to be done for this pipeline step
    }
    fun process(data: PipelineData) {
        // the actuall processing of the pipeline step
    }
}