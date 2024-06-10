package com.google.android.youtubevideodownloader;

import java.io.Serializable;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

public class YoutubeDataModel implements Serializable {
  private PlayerConfig playerConfig;

  private String trackingParams;

  private VideoDetails videoDetails;

  private StreamingData streamingData;

  private String adBreakHeartbeatParams;

  private ResponseContext responseContext;

  private PlayabilityStatus playabilityStatus;

  private PlaybackTracking playbackTracking;

  public PlayerConfig getPlayerConfig() {
    return this.playerConfig;
  }

  public void setPlayerConfig(PlayerConfig playerConfig) {
    this.playerConfig = playerConfig;
  }

  public String getTrackingParams() {
    return this.trackingParams;
  }

  public void setTrackingParams(String trackingParams) {
    this.trackingParams = trackingParams;
  }

  public VideoDetails getVideoDetails() {
    return this.videoDetails;
  }

  public void setVideoDetails(VideoDetails videoDetails) {
    this.videoDetails = videoDetails;
  }

  public StreamingData getStreamingData() {
    return this.streamingData;
  }

  public void setStreamingData(StreamingData streamingData) {
    this.streamingData = streamingData;
  }

  public String getAdBreakHeartbeatParams() {
    return this.adBreakHeartbeatParams;
  }

  public void setAdBreakHeartbeatParams(String adBreakHeartbeatParams) {
    this.adBreakHeartbeatParams = adBreakHeartbeatParams;
  }

  public ResponseContext getResponseContext() {
    return this.responseContext;
  }

  public void setResponseContext(ResponseContext responseContext) {
    this.responseContext = responseContext;
  }

  public PlayabilityStatus getPlayabilityStatus() {
    return this.playabilityStatus;
  }

  public void setPlayabilityStatus(PlayabilityStatus playabilityStatus) {
    this.playabilityStatus = playabilityStatus;
  }

  public PlaybackTracking getPlaybackTracking() {
    return this.playbackTracking;
  }

  public void setPlaybackTracking(PlaybackTracking playbackTracking) {
    this.playbackTracking = playbackTracking;
  }

  public static class PlayerConfig implements Serializable {
    private ExoPlayerConfig exoPlayerConfig;

    private AudioConfig audioConfig;

    public ExoPlayerConfig getExoPlayerConfig() {
      return this.exoPlayerConfig;
    }

    public void setExoPlayerConfig(ExoPlayerConfig exoPlayerConfig) {
      this.exoPlayerConfig = exoPlayerConfig;
    }

    public AudioConfig getAudioConfig() {
      return this.audioConfig;
    }

    public void setAudioConfig(AudioConfig audioConfig) {
      this.audioConfig = audioConfig;
    }

    public static class ExoPlayerConfig implements Serializable {
      private Boolean enableVariableSpeedPlayback;

      private Boolean enableVp9EncryptedIfInHardware;

      private Integer maxVideoDurationPerFetchMs;

      private Boolean useExoPlayer;

      private Integer liveOnlyBufferHealthHalfLifeSeconds;

      private Boolean onesieFixNonZeroStartTimeFormatSelection;

      private Boolean ignoreLoadTimeoutForFallback;

      private Integer maxVideoEstimatedLoadDurationMs;

      private Boolean useAdaptiveBitrate;

      private Boolean useMedialibAudioTrackRendererForLive;

      private Integer serverBweMultiplier;

      private Boolean reportExoPlayerStateOnTransition;

      private Boolean cacheCheckDirectoryWritabilityOnce;

      private Integer maxResolutionForWhiteNoise;

      private Integer liveOnlyWindowChunks;

      private Boolean canPlayHdDrm;

      private String whiteNoiseRenderEffectMode;

      private Boolean enableDynamicHdr;

      private Boolean useAbruptSplicing;

      private Boolean enableLibvpxHdr;

      private Boolean v2PerformEarlyStreamSelection;

      private Boolean allowDroppingUndecodedFrames;

      private Double sufficientBandwidthOverhead;

      private Integer lowAudioQualityBandwidthThresholdBps;

      private Integer whiteNoiseScale;

      private Integer allowCacheOverrideToLowerQualitiesWithinRange;

      private Integer slidingPercentileScalar;

      private Integer videoBufferSegmentCount;

      private Boolean onesieDataSourceAboveCacheDataSource;

      private Boolean enableVpxMediaView;

      private Integer httpReadTimeoutMs;

      private Integer v2MinTimeBetweenAbrReevaluationMs;

      private Integer minimumBandwidthSampleBytes;

      private Integer minDurationForPlaybackRestartMs;

      private Boolean onlyVideoBandwidth;

      private Boolean usePredictedBuffer;

      private Boolean enableRedirectorHostFallback;

      private Boolean v2UsePlaybackStreamSelectionResult;

      private Integer hdrMaxScreenBrightnessThreshold;

      private Integer maxDurationForQualityDecreaseMs;

      private Double lowPoolLoad;

      private Integer minDurationForPlaybackStartMs;

      private Boolean useRadioTypeForInitialQualitySelection;

      private Boolean useAverageBitrate;

      private Integer numAudioSegmentsPerFetch;

      private Integer httpNonplayerLoadTimeoutMs;

      private Boolean enableCacheAwareStreamSelection;

      private Integer readAheadGrowthRate;

      private Integer estimatedServerClockHalfLife;

      private Integer liveOnlyMinLatencyToSeekRatio;

      private Boolean enableLibvpxVideoTrackRenderer;

      private String onesieVideoBufferReadTimeoutMs;

      private Integer minDurationForQualityIncreaseMs;

      private List<String> lowAudioQualityConnTypes;

      private Boolean enableLibvpxFallback;

      private Integer lowWatermarkMs;

      private Integer maxReadAheadMediaTimeMs;

      private Integer highWatermarkMs;

      private Integer httpConnectTimeoutMs;

      private Integer minErrorsForPcrFallback;

      private Boolean enableDynamicHdrInHardware;

      private String manifestlessSequenceMethod;

      private Boolean enableMediaCodecSwHdr;

      private Integer minRetryCount;

      private Boolean useDashForLiveStreams;

      private Boolean useExoCronetDataSource;

      private Boolean forceWidevineL3;

      private Integer ultralowAudioQualityBandwidthThresholdBps;

      private Integer minErrorsForRedirectorHostFallback;

      private Boolean enableVp9IfThresholdsPass;

      private Boolean logMediaRequestEventsToCsi;

      private Boolean blacklistFormatOnError;

      private Boolean ignoreUnneededSeeksToLiveHead;

      private Boolean enableMediaCodecHdr;

      private Integer maxFrameDropIntervalMs;

      private Boolean useDashForOtfAndCompletedLiveStreams;

      private Double liveOnlyMinBufferHealthRatio;

      private Integer bufferChunkSizeKb;

      private Double slidingPercentile;

      private String predictorType;

      private Integer minChunksNeededToPreferOffline;

      private Integer secondsToMaxAggressiveness;

      private Integer minReadAheadMediaTimeMs;

      private Boolean enableInfiniteNetworkLoadingRetries;

      private Integer maxAllowableTimeBeforeMediaTimeUpdateSec;

      private Boolean useStickyRedirectHttpDataSource;

      private Boolean avoidReusePlaybackAcrossLoadvideos;

      private List<Integer> bearerMinDurationToRetainAfterDiscardMs;

      private Integer maxInitialByteRate;

      private Boolean useExoPlayerV2;

      private Boolean useRedirectorOnNetworkChange;

      private Boolean ignoreViewportSizeWhenSticky;

      private Boolean disableCacheAwareVideoFormatEvaluation;

      private Boolean enableVp9EncryptedIfThresholdsPass;

      private Boolean useLiveHeadWindow;

      private List<String> nonHardwareMediaCodecNames;

      private Boolean emitVideoDecoderChangeEvents;

      private Boolean enableHighlyAvailableFormatFallbackOnPcr;

      private Integer httpLoadTimeoutMs;

      private Boolean disableLibvpxLoopFilter;

      private String serverProvidedBandwidthHeader;

      private Boolean enableOpus;

      private String numVideoSegmentsPerFetchStrategy;

      private Integer slidingWindowSize;

      private Boolean preventVideoFrameLaggingWithLibvpx;

      private Boolean recordTrackRendererTimingEvents;

      private Boolean enableV2Gapless;

      private Integer drmMaxKeyfetchDelayMs;

      private Integer minAdaptiveVideoQuality;

      private Integer numVideoSegmentsPerFetch;

      private Boolean useOpusMedAsLowQualityAudio;

      private String manifestlessPartialChunkStrategy;

      private Boolean enableBandaidHttpDataSource;

      private Integer liveOnlyReadaheadStepSizeChunks;

      private Integer minDurationToRetainAfterDiscardMs;

      private Integer hdrMinScreenBrightness;

      private Integer audioBufferSegmentCount;

      private Boolean preferOnesieBufferedFormat;

      private Boolean enableVp9IfInHardware;

      private Boolean useDynamicReadAhead;

      private String onesieVideoBufferLoadTimeoutMs;

      private Double drmMetricsQoeLoggingFraction;

      private Double highPoolLoad;

      private Boolean estimatedServerClockStrictOffset;

      private Boolean useLiveDvrForDashLiveStreams;

      private Integer whiteNoiseOffset;

      private Boolean libvpxEnableGl;

      private Boolean cronetResetTimeoutOnRedirects;

      private Integer platypusBackBufferDurationMs;

      private Boolean enableExoplayerReuse;

      private Boolean useMediaTimeCappedLoadControl;

      private Boolean useLiveHeadTimeMillis;

      private Boolean useYtVodMediaSourceForV2;

      private Boolean enableSurfaceviewResizeWorkaround;

      private Boolean allowTrackSelectionWithUpdatedVideoItagsForExoV2;

      private String liveOnlyPegStrategy;

      private Boolean matchQualityToViewportOnUnfullscreen;

      private Boolean enableMaxReadaheadAbrThreshold;

      public Boolean getEnableVariableSpeedPlayback() {
        return this.enableVariableSpeedPlayback;
      }

      public void setEnableVariableSpeedPlayback(Boolean enableVariableSpeedPlayback) {
        this.enableVariableSpeedPlayback = enableVariableSpeedPlayback;
      }

      public Boolean getEnableVp9EncryptedIfInHardware() {
        return this.enableVp9EncryptedIfInHardware;
      }

      public void setEnableVp9EncryptedIfInHardware(Boolean enableVp9EncryptedIfInHardware) {
        this.enableVp9EncryptedIfInHardware = enableVp9EncryptedIfInHardware;
      }

      public Integer getMaxVideoDurationPerFetchMs() {
        return this.maxVideoDurationPerFetchMs;
      }

      public void setMaxVideoDurationPerFetchMs(Integer maxVideoDurationPerFetchMs) {
        this.maxVideoDurationPerFetchMs = maxVideoDurationPerFetchMs;
      }

      public Boolean getUseExoPlayer() {
        return this.useExoPlayer;
      }

      public void setUseExoPlayer(Boolean useExoPlayer) {
        this.useExoPlayer = useExoPlayer;
      }

      public Integer getLiveOnlyBufferHealthHalfLifeSeconds() {
        return this.liveOnlyBufferHealthHalfLifeSeconds;
      }

      public void setLiveOnlyBufferHealthHalfLifeSeconds(Integer liveOnlyBufferHealthHalfLifeSeconds) {
        this.liveOnlyBufferHealthHalfLifeSeconds = liveOnlyBufferHealthHalfLifeSeconds;
      }

      public Boolean getOnesieFixNonZeroStartTimeFormatSelection() {
        return this.onesieFixNonZeroStartTimeFormatSelection;
      }

      public void setOnesieFixNonZeroStartTimeFormatSelection(Boolean onesieFixNonZeroStartTimeFormatSelection) {
        this.onesieFixNonZeroStartTimeFormatSelection = onesieFixNonZeroStartTimeFormatSelection;
      }

      public Boolean getIgnoreLoadTimeoutForFallback() {
        return this.ignoreLoadTimeoutForFallback;
      }

      public void setIgnoreLoadTimeoutForFallback(Boolean ignoreLoadTimeoutForFallback) {
        this.ignoreLoadTimeoutForFallback = ignoreLoadTimeoutForFallback;
      }

      public Integer getMaxVideoEstimatedLoadDurationMs() {
        return this.maxVideoEstimatedLoadDurationMs;
      }

      public void setMaxVideoEstimatedLoadDurationMs(Integer maxVideoEstimatedLoadDurationMs) {
        this.maxVideoEstimatedLoadDurationMs = maxVideoEstimatedLoadDurationMs;
      }

      public Boolean getUseAdaptiveBitrate() {
        return this.useAdaptiveBitrate;
      }

      public void setUseAdaptiveBitrate(Boolean useAdaptiveBitrate) {
        this.useAdaptiveBitrate = useAdaptiveBitrate;
      }

      public Boolean getUseMedialibAudioTrackRendererForLive() {
        return this.useMedialibAudioTrackRendererForLive;
      }

      public void setUseMedialibAudioTrackRendererForLive(Boolean useMedialibAudioTrackRendererForLive) {
        this.useMedialibAudioTrackRendererForLive = useMedialibAudioTrackRendererForLive;
      }

      public Integer getServerBweMultiplier() {
        return this.serverBweMultiplier;
      }

      public void setServerBweMultiplier(Integer serverBweMultiplier) {
        this.serverBweMultiplier = serverBweMultiplier;
      }

      public Boolean getReportExoPlayerStateOnTransition() {
        return this.reportExoPlayerStateOnTransition;
      }

      public void setReportExoPlayerStateOnTransition(Boolean reportExoPlayerStateOnTransition) {
        this.reportExoPlayerStateOnTransition = reportExoPlayerStateOnTransition;
      }

      public Boolean getCacheCheckDirectoryWritabilityOnce() {
        return this.cacheCheckDirectoryWritabilityOnce;
      }

      public void setCacheCheckDirectoryWritabilityOnce(Boolean cacheCheckDirectoryWritabilityOnce) {
        this.cacheCheckDirectoryWritabilityOnce = cacheCheckDirectoryWritabilityOnce;
      }

      public Integer getMaxResolutionForWhiteNoise() {
        return this.maxResolutionForWhiteNoise;
      }

      public void setMaxResolutionForWhiteNoise(Integer maxResolutionForWhiteNoise) {
        this.maxResolutionForWhiteNoise = maxResolutionForWhiteNoise;
      }

      public Integer getLiveOnlyWindowChunks() {
        return this.liveOnlyWindowChunks;
      }

      public void setLiveOnlyWindowChunks(Integer liveOnlyWindowChunks) {
        this.liveOnlyWindowChunks = liveOnlyWindowChunks;
      }

      public Boolean getCanPlayHdDrm() {
        return this.canPlayHdDrm;
      }

      public void setCanPlayHdDrm(Boolean canPlayHdDrm) {
        this.canPlayHdDrm = canPlayHdDrm;
      }

      public String getWhiteNoiseRenderEffectMode() {
        return this.whiteNoiseRenderEffectMode;
      }

      public void setWhiteNoiseRenderEffectMode(String whiteNoiseRenderEffectMode) {
        this.whiteNoiseRenderEffectMode = whiteNoiseRenderEffectMode;
      }

      public Boolean getEnableDynamicHdr() {
        return this.enableDynamicHdr;
      }

      public void setEnableDynamicHdr(Boolean enableDynamicHdr) {
        this.enableDynamicHdr = enableDynamicHdr;
      }

      public Boolean getUseAbruptSplicing() {
        return this.useAbruptSplicing;
      }

      public void setUseAbruptSplicing(Boolean useAbruptSplicing) {
        this.useAbruptSplicing = useAbruptSplicing;
      }

      public Boolean getEnableLibvpxHdr() {
        return this.enableLibvpxHdr;
      }

      public void setEnableLibvpxHdr(Boolean enableLibvpxHdr) {
        this.enableLibvpxHdr = enableLibvpxHdr;
      }

      public Boolean getV2PerformEarlyStreamSelection() {
        return this.v2PerformEarlyStreamSelection;
      }

      public void setV2PerformEarlyStreamSelection(Boolean v2PerformEarlyStreamSelection) {
        this.v2PerformEarlyStreamSelection = v2PerformEarlyStreamSelection;
      }

      public Boolean getAllowDroppingUndecodedFrames() {
        return this.allowDroppingUndecodedFrames;
      }

      public void setAllowDroppingUndecodedFrames(Boolean allowDroppingUndecodedFrames) {
        this.allowDroppingUndecodedFrames = allowDroppingUndecodedFrames;
      }

      public Double getSufficientBandwidthOverhead() {
        return this.sufficientBandwidthOverhead;
      }

      public void setSufficientBandwidthOverhead(Double sufficientBandwidthOverhead) {
        this.sufficientBandwidthOverhead = sufficientBandwidthOverhead;
      }

      public Integer getLowAudioQualityBandwidthThresholdBps() {
        return this.lowAudioQualityBandwidthThresholdBps;
      }

      public void setLowAudioQualityBandwidthThresholdBps(Integer lowAudioQualityBandwidthThresholdBps) {
        this.lowAudioQualityBandwidthThresholdBps = lowAudioQualityBandwidthThresholdBps;
      }

      public Integer getWhiteNoiseScale() {
        return this.whiteNoiseScale;
      }

      public void setWhiteNoiseScale(Integer whiteNoiseScale) {
        this.whiteNoiseScale = whiteNoiseScale;
      }

      public Integer getAllowCacheOverrideToLowerQualitiesWithinRange() {
        return this.allowCacheOverrideToLowerQualitiesWithinRange;
      }

      public void setAllowCacheOverrideToLowerQualitiesWithinRange(Integer allowCacheOverrideToLowerQualitiesWithinRange) {
        this.allowCacheOverrideToLowerQualitiesWithinRange = allowCacheOverrideToLowerQualitiesWithinRange;
      }

      public Integer getSlidingPercentileScalar() {
        return this.slidingPercentileScalar;
      }

      public void setSlidingPercentileScalar(Integer slidingPercentileScalar) {
        this.slidingPercentileScalar = slidingPercentileScalar;
      }

      public Integer getVideoBufferSegmentCount() {
        return this.videoBufferSegmentCount;
      }

      public void setVideoBufferSegmentCount(Integer videoBufferSegmentCount) {
        this.videoBufferSegmentCount = videoBufferSegmentCount;
      }

      public Boolean getOnesieDataSourceAboveCacheDataSource() {
        return this.onesieDataSourceAboveCacheDataSource;
      }

      public void setOnesieDataSourceAboveCacheDataSource(Boolean onesieDataSourceAboveCacheDataSource) {
        this.onesieDataSourceAboveCacheDataSource = onesieDataSourceAboveCacheDataSource;
      }

      public Boolean getEnableVpxMediaView() {
        return this.enableVpxMediaView;
      }

      public void setEnableVpxMediaView(Boolean enableVpxMediaView) {
        this.enableVpxMediaView = enableVpxMediaView;
      }

      public Integer getHttpReadTimeoutMs() {
        return this.httpReadTimeoutMs;
      }

      public void setHttpReadTimeoutMs(Integer httpReadTimeoutMs) {
        this.httpReadTimeoutMs = httpReadTimeoutMs;
      }

      public Integer getV2MinTimeBetweenAbrReevaluationMs() {
        return this.v2MinTimeBetweenAbrReevaluationMs;
      }

      public void setV2MinTimeBetweenAbrReevaluationMs(Integer v2MinTimeBetweenAbrReevaluationMs) {
        this.v2MinTimeBetweenAbrReevaluationMs = v2MinTimeBetweenAbrReevaluationMs;
      }

      public Integer getMinimumBandwidthSampleBytes() {
        return this.minimumBandwidthSampleBytes;
      }

      public void setMinimumBandwidthSampleBytes(Integer minimumBandwidthSampleBytes) {
        this.minimumBandwidthSampleBytes = minimumBandwidthSampleBytes;
      }

      public Integer getMinDurationForPlaybackRestartMs() {
        return this.minDurationForPlaybackRestartMs;
      }

      public void setMinDurationForPlaybackRestartMs(Integer minDurationForPlaybackRestartMs) {
        this.minDurationForPlaybackRestartMs = minDurationForPlaybackRestartMs;
      }

      public Boolean getOnlyVideoBandwidth() {
        return this.onlyVideoBandwidth;
      }

      public void setOnlyVideoBandwidth(Boolean onlyVideoBandwidth) {
        this.onlyVideoBandwidth = onlyVideoBandwidth;
      }

      public Boolean getUsePredictedBuffer() {
        return this.usePredictedBuffer;
      }

      public void setUsePredictedBuffer(Boolean usePredictedBuffer) {
        this.usePredictedBuffer = usePredictedBuffer;
      }

      public Boolean getEnableRedirectorHostFallback() {
        return this.enableRedirectorHostFallback;
      }

      public void setEnableRedirectorHostFallback(Boolean enableRedirectorHostFallback) {
        this.enableRedirectorHostFallback = enableRedirectorHostFallback;
      }

      public Boolean getV2UsePlaybackStreamSelectionResult() {
        return this.v2UsePlaybackStreamSelectionResult;
      }

      public void setV2UsePlaybackStreamSelectionResult(Boolean v2UsePlaybackStreamSelectionResult) {
        this.v2UsePlaybackStreamSelectionResult = v2UsePlaybackStreamSelectionResult;
      }

      public Integer getHdrMaxScreenBrightnessThreshold() {
        return this.hdrMaxScreenBrightnessThreshold;
      }

      public void setHdrMaxScreenBrightnessThreshold(Integer hdrMaxScreenBrightnessThreshold) {
        this.hdrMaxScreenBrightnessThreshold = hdrMaxScreenBrightnessThreshold;
      }

      public Integer getMaxDurationForQualityDecreaseMs() {
        return this.maxDurationForQualityDecreaseMs;
      }

      public void setMaxDurationForQualityDecreaseMs(Integer maxDurationForQualityDecreaseMs) {
        this.maxDurationForQualityDecreaseMs = maxDurationForQualityDecreaseMs;
      }

      public Double getLowPoolLoad() {
        return this.lowPoolLoad;
      }

      public void setLowPoolLoad(Double lowPoolLoad) {
        this.lowPoolLoad = lowPoolLoad;
      }

      public Integer getMinDurationForPlaybackStartMs() {
        return this.minDurationForPlaybackStartMs;
      }

      public void setMinDurationForPlaybackStartMs(Integer minDurationForPlaybackStartMs) {
        this.minDurationForPlaybackStartMs = minDurationForPlaybackStartMs;
      }

      public Boolean getUseRadioTypeForInitialQualitySelection() {
        return this.useRadioTypeForInitialQualitySelection;
      }

      public void setUseRadioTypeForInitialQualitySelection(Boolean useRadioTypeForInitialQualitySelection) {
        this.useRadioTypeForInitialQualitySelection = useRadioTypeForInitialQualitySelection;
      }

      public Boolean getUseAverageBitrate() {
        return this.useAverageBitrate;
      }

      public void setUseAverageBitrate(Boolean useAverageBitrate) {
        this.useAverageBitrate = useAverageBitrate;
      }

      public Integer getNumAudioSegmentsPerFetch() {
        return this.numAudioSegmentsPerFetch;
      }

      public void setNumAudioSegmentsPerFetch(Integer numAudioSegmentsPerFetch) {
        this.numAudioSegmentsPerFetch = numAudioSegmentsPerFetch;
      }

      public Integer getHttpNonplayerLoadTimeoutMs() {
        return this.httpNonplayerLoadTimeoutMs;
      }

      public void setHttpNonplayerLoadTimeoutMs(Integer httpNonplayerLoadTimeoutMs) {
        this.httpNonplayerLoadTimeoutMs = httpNonplayerLoadTimeoutMs;
      }

      public Boolean getEnableCacheAwareStreamSelection() {
        return this.enableCacheAwareStreamSelection;
      }

      public void setEnableCacheAwareStreamSelection(Boolean enableCacheAwareStreamSelection) {
        this.enableCacheAwareStreamSelection = enableCacheAwareStreamSelection;
      }

      public Integer getReadAheadGrowthRate() {
        return this.readAheadGrowthRate;
      }

      public void setReadAheadGrowthRate(Integer readAheadGrowthRate) {
        this.readAheadGrowthRate = readAheadGrowthRate;
      }

      public Integer getEstimatedServerClockHalfLife() {
        return this.estimatedServerClockHalfLife;
      }

      public void setEstimatedServerClockHalfLife(Integer estimatedServerClockHalfLife) {
        this.estimatedServerClockHalfLife = estimatedServerClockHalfLife;
      }

      public Integer getLiveOnlyMinLatencyToSeekRatio() {
        return this.liveOnlyMinLatencyToSeekRatio;
      }

      public void setLiveOnlyMinLatencyToSeekRatio(Integer liveOnlyMinLatencyToSeekRatio) {
        this.liveOnlyMinLatencyToSeekRatio = liveOnlyMinLatencyToSeekRatio;
      }

      public Boolean getEnableLibvpxVideoTrackRenderer() {
        return this.enableLibvpxVideoTrackRenderer;
      }

      public void setEnableLibvpxVideoTrackRenderer(Boolean enableLibvpxVideoTrackRenderer) {
        this.enableLibvpxVideoTrackRenderer = enableLibvpxVideoTrackRenderer;
      }

      public String getOnesieVideoBufferReadTimeoutMs() {
        return this.onesieVideoBufferReadTimeoutMs;
      }

      public void setOnesieVideoBufferReadTimeoutMs(String onesieVideoBufferReadTimeoutMs) {
        this.onesieVideoBufferReadTimeoutMs = onesieVideoBufferReadTimeoutMs;
      }

      public Integer getMinDurationForQualityIncreaseMs() {
        return this.minDurationForQualityIncreaseMs;
      }

      public void setMinDurationForQualityIncreaseMs(Integer minDurationForQualityIncreaseMs) {
        this.minDurationForQualityIncreaseMs = minDurationForQualityIncreaseMs;
      }

      public List<String> getLowAudioQualityConnTypes() {
        return this.lowAudioQualityConnTypes;
      }

      public void setLowAudioQualityConnTypes(List<String> lowAudioQualityConnTypes) {
        this.lowAudioQualityConnTypes = lowAudioQualityConnTypes;
      }

      public Boolean getEnableLibvpxFallback() {
        return this.enableLibvpxFallback;
      }

      public void setEnableLibvpxFallback(Boolean enableLibvpxFallback) {
        this.enableLibvpxFallback = enableLibvpxFallback;
      }

      public Integer getLowWatermarkMs() {
        return this.lowWatermarkMs;
      }

      public void setLowWatermarkMs(Integer lowWatermarkMs) {
        this.lowWatermarkMs = lowWatermarkMs;
      }

      public Integer getMaxReadAheadMediaTimeMs() {
        return this.maxReadAheadMediaTimeMs;
      }

      public void setMaxReadAheadMediaTimeMs(Integer maxReadAheadMediaTimeMs) {
        this.maxReadAheadMediaTimeMs = maxReadAheadMediaTimeMs;
      }

      public Integer getHighWatermarkMs() {
        return this.highWatermarkMs;
      }

      public void setHighWatermarkMs(Integer highWatermarkMs) {
        this.highWatermarkMs = highWatermarkMs;
      }

      public Integer getHttpConnectTimeoutMs() {
        return this.httpConnectTimeoutMs;
      }

      public void setHttpConnectTimeoutMs(Integer httpConnectTimeoutMs) {
        this.httpConnectTimeoutMs = httpConnectTimeoutMs;
      }

      public Integer getMinErrorsForPcrFallback() {
        return this.minErrorsForPcrFallback;
      }

      public void setMinErrorsForPcrFallback(Integer minErrorsForPcrFallback) {
        this.minErrorsForPcrFallback = minErrorsForPcrFallback;
      }

      public Boolean getEnableDynamicHdrInHardware() {
        return this.enableDynamicHdrInHardware;
      }

      public void setEnableDynamicHdrInHardware(Boolean enableDynamicHdrInHardware) {
        this.enableDynamicHdrInHardware = enableDynamicHdrInHardware;
      }

      public String getManifestlessSequenceMethod() {
        return this.manifestlessSequenceMethod;
      }

      public void setManifestlessSequenceMethod(String manifestlessSequenceMethod) {
        this.manifestlessSequenceMethod = manifestlessSequenceMethod;
      }

      public Boolean getEnableMediaCodecSwHdr() {
        return this.enableMediaCodecSwHdr;
      }

      public void setEnableMediaCodecSwHdr(Boolean enableMediaCodecSwHdr) {
        this.enableMediaCodecSwHdr = enableMediaCodecSwHdr;
      }

      public Integer getMinRetryCount() {
        return this.minRetryCount;
      }

      public void setMinRetryCount(Integer minRetryCount) {
        this.minRetryCount = minRetryCount;
      }

      public Boolean getUseDashForLiveStreams() {
        return this.useDashForLiveStreams;
      }

      public void setUseDashForLiveStreams(Boolean useDashForLiveStreams) {
        this.useDashForLiveStreams = useDashForLiveStreams;
      }

      public Boolean getUseExoCronetDataSource() {
        return this.useExoCronetDataSource;
      }

      public void setUseExoCronetDataSource(Boolean useExoCronetDataSource) {
        this.useExoCronetDataSource = useExoCronetDataSource;
      }

      public Boolean getForceWidevineL3() {
        return this.forceWidevineL3;
      }

      public void setForceWidevineL3(Boolean forceWidevineL3) {
        this.forceWidevineL3 = forceWidevineL3;
      }

      public Integer getUltralowAudioQualityBandwidthThresholdBps() {
        return this.ultralowAudioQualityBandwidthThresholdBps;
      }

      public void setUltralowAudioQualityBandwidthThresholdBps(Integer ultralowAudioQualityBandwidthThresholdBps) {
        this.ultralowAudioQualityBandwidthThresholdBps = ultralowAudioQualityBandwidthThresholdBps;
      }

      public Integer getMinErrorsForRedirectorHostFallback() {
        return this.minErrorsForRedirectorHostFallback;
      }

      public void setMinErrorsForRedirectorHostFallback(Integer minErrorsForRedirectorHostFallback) {
        this.minErrorsForRedirectorHostFallback = minErrorsForRedirectorHostFallback;
      }

      public Boolean getEnableVp9IfThresholdsPass() {
        return this.enableVp9IfThresholdsPass;
      }

      public void setEnableVp9IfThresholdsPass(Boolean enableVp9IfThresholdsPass) {
        this.enableVp9IfThresholdsPass = enableVp9IfThresholdsPass;
      }

      public Boolean getLogMediaRequestEventsToCsi() {
        return this.logMediaRequestEventsToCsi;
      }

      public void setLogMediaRequestEventsToCsi(Boolean logMediaRequestEventsToCsi) {
        this.logMediaRequestEventsToCsi = logMediaRequestEventsToCsi;
      }

      public Boolean getBlacklistFormatOnError() {
        return this.blacklistFormatOnError;
      }

      public void setBlacklistFormatOnError(Boolean blacklistFormatOnError) {
        this.blacklistFormatOnError = blacklistFormatOnError;
      }

      public Boolean getIgnoreUnneededSeeksToLiveHead() {
        return this.ignoreUnneededSeeksToLiveHead;
      }

      public void setIgnoreUnneededSeeksToLiveHead(Boolean ignoreUnneededSeeksToLiveHead) {
        this.ignoreUnneededSeeksToLiveHead = ignoreUnneededSeeksToLiveHead;
      }

      public Boolean getEnableMediaCodecHdr() {
        return this.enableMediaCodecHdr;
      }

      public void setEnableMediaCodecHdr(Boolean enableMediaCodecHdr) {
        this.enableMediaCodecHdr = enableMediaCodecHdr;
      }

      public Integer getMaxFrameDropIntervalMs() {
        return this.maxFrameDropIntervalMs;
      }

      public void setMaxFrameDropIntervalMs(Integer maxFrameDropIntervalMs) {
        this.maxFrameDropIntervalMs = maxFrameDropIntervalMs;
      }

      public Boolean getUseDashForOtfAndCompletedLiveStreams() {
        return this.useDashForOtfAndCompletedLiveStreams;
      }

      public void setUseDashForOtfAndCompletedLiveStreams(Boolean useDashForOtfAndCompletedLiveStreams) {
        this.useDashForOtfAndCompletedLiveStreams = useDashForOtfAndCompletedLiveStreams;
      }

      public Double getLiveOnlyMinBufferHealthRatio() {
        return this.liveOnlyMinBufferHealthRatio;
      }

      public void setLiveOnlyMinBufferHealthRatio(Double liveOnlyMinBufferHealthRatio) {
        this.liveOnlyMinBufferHealthRatio = liveOnlyMinBufferHealthRatio;
      }

      public Integer getBufferChunkSizeKb() {
        return this.bufferChunkSizeKb;
      }

      public void setBufferChunkSizeKb(Integer bufferChunkSizeKb) {
        this.bufferChunkSizeKb = bufferChunkSizeKb;
      }

      public Double getSlidingPercentile() {
        return this.slidingPercentile;
      }

      public void setSlidingPercentile(Double slidingPercentile) {
        this.slidingPercentile = slidingPercentile;
      }

      public String getPredictorType() {
        return this.predictorType;
      }

      public void setPredictorType(String predictorType) {
        this.predictorType = predictorType;
      }

      public Integer getMinChunksNeededToPreferOffline() {
        return this.minChunksNeededToPreferOffline;
      }

      public void setMinChunksNeededToPreferOffline(Integer minChunksNeededToPreferOffline) {
        this.minChunksNeededToPreferOffline = minChunksNeededToPreferOffline;
      }

      public Integer getSecondsToMaxAggressiveness() {
        return this.secondsToMaxAggressiveness;
      }

      public void setSecondsToMaxAggressiveness(Integer secondsToMaxAggressiveness) {
        this.secondsToMaxAggressiveness = secondsToMaxAggressiveness;
      }

      public Integer getMinReadAheadMediaTimeMs() {
        return this.minReadAheadMediaTimeMs;
      }

      public void setMinReadAheadMediaTimeMs(Integer minReadAheadMediaTimeMs) {
        this.minReadAheadMediaTimeMs = minReadAheadMediaTimeMs;
      }

      public Boolean getEnableInfiniteNetworkLoadingRetries() {
        return this.enableInfiniteNetworkLoadingRetries;
      }

      public void setEnableInfiniteNetworkLoadingRetries(Boolean enableInfiniteNetworkLoadingRetries) {
        this.enableInfiniteNetworkLoadingRetries = enableInfiniteNetworkLoadingRetries;
      }

      public Integer getMaxAllowableTimeBeforeMediaTimeUpdateSec() {
        return this.maxAllowableTimeBeforeMediaTimeUpdateSec;
      }

      public void setMaxAllowableTimeBeforeMediaTimeUpdateSec(Integer maxAllowableTimeBeforeMediaTimeUpdateSec) {
        this.maxAllowableTimeBeforeMediaTimeUpdateSec = maxAllowableTimeBeforeMediaTimeUpdateSec;
      }

      public Boolean getUseStickyRedirectHttpDataSource() {
        return this.useStickyRedirectHttpDataSource;
      }

      public void setUseStickyRedirectHttpDataSource(Boolean useStickyRedirectHttpDataSource) {
        this.useStickyRedirectHttpDataSource = useStickyRedirectHttpDataSource;
      }

      public Boolean getAvoidReusePlaybackAcrossLoadvideos() {
        return this.avoidReusePlaybackAcrossLoadvideos;
      }

      public void setAvoidReusePlaybackAcrossLoadvideos(Boolean avoidReusePlaybackAcrossLoadvideos) {
        this.avoidReusePlaybackAcrossLoadvideos = avoidReusePlaybackAcrossLoadvideos;
      }

      public List<Integer> getBearerMinDurationToRetainAfterDiscardMs() {
        return this.bearerMinDurationToRetainAfterDiscardMs;
      }

      public void setBearerMinDurationToRetainAfterDiscardMs(List<Integer> bearerMinDurationToRetainAfterDiscardMs) {
        this.bearerMinDurationToRetainAfterDiscardMs = bearerMinDurationToRetainAfterDiscardMs;
      }

      public Integer getMaxInitialByteRate() {
        return this.maxInitialByteRate;
      }

      public void setMaxInitialByteRate(Integer maxInitialByteRate) {
        this.maxInitialByteRate = maxInitialByteRate;
      }

      public Boolean getUseExoPlayerV2() {
        return this.useExoPlayerV2;
      }

      public void setUseExoPlayerV2(Boolean useExoPlayerV2) {
        this.useExoPlayerV2 = useExoPlayerV2;
      }

      public Boolean getUseRedirectorOnNetworkChange() {
        return this.useRedirectorOnNetworkChange;
      }

      public void setUseRedirectorOnNetworkChange(Boolean useRedirectorOnNetworkChange) {
        this.useRedirectorOnNetworkChange = useRedirectorOnNetworkChange;
      }

      public Boolean getIgnoreViewportSizeWhenSticky() {
        return this.ignoreViewportSizeWhenSticky;
      }

      public void setIgnoreViewportSizeWhenSticky(Boolean ignoreViewportSizeWhenSticky) {
        this.ignoreViewportSizeWhenSticky = ignoreViewportSizeWhenSticky;
      }

      public Boolean getDisableCacheAwareVideoFormatEvaluation() {
        return this.disableCacheAwareVideoFormatEvaluation;
      }

      public void setDisableCacheAwareVideoFormatEvaluation(Boolean disableCacheAwareVideoFormatEvaluation) {
        this.disableCacheAwareVideoFormatEvaluation = disableCacheAwareVideoFormatEvaluation;
      }

      public Boolean getEnableVp9EncryptedIfThresholdsPass() {
        return this.enableVp9EncryptedIfThresholdsPass;
      }

      public void setEnableVp9EncryptedIfThresholdsPass(Boolean enableVp9EncryptedIfThresholdsPass) {
        this.enableVp9EncryptedIfThresholdsPass = enableVp9EncryptedIfThresholdsPass;
      }

      public Boolean getUseLiveHeadWindow() {
        return this.useLiveHeadWindow;
      }

      public void setUseLiveHeadWindow(Boolean useLiveHeadWindow) {
        this.useLiveHeadWindow = useLiveHeadWindow;
      }

      public List<String> getNonHardwareMediaCodecNames() {
        return this.nonHardwareMediaCodecNames;
      }

      public void setNonHardwareMediaCodecNames(List<String> nonHardwareMediaCodecNames) {
        this.nonHardwareMediaCodecNames = nonHardwareMediaCodecNames;
      }

      public Boolean getEmitVideoDecoderChangeEvents() {
        return this.emitVideoDecoderChangeEvents;
      }

      public void setEmitVideoDecoderChangeEvents(Boolean emitVideoDecoderChangeEvents) {
        this.emitVideoDecoderChangeEvents = emitVideoDecoderChangeEvents;
      }

      public Boolean getEnableHighlyAvailableFormatFallbackOnPcr() {
        return this.enableHighlyAvailableFormatFallbackOnPcr;
      }

      public void setEnableHighlyAvailableFormatFallbackOnPcr(Boolean enableHighlyAvailableFormatFallbackOnPcr) {
        this.enableHighlyAvailableFormatFallbackOnPcr = enableHighlyAvailableFormatFallbackOnPcr;
      }

      public Integer getHttpLoadTimeoutMs() {
        return this.httpLoadTimeoutMs;
      }

      public void setHttpLoadTimeoutMs(Integer httpLoadTimeoutMs) {
        this.httpLoadTimeoutMs = httpLoadTimeoutMs;
      }

      public Boolean getDisableLibvpxLoopFilter() {
        return this.disableLibvpxLoopFilter;
      }

      public void setDisableLibvpxLoopFilter(Boolean disableLibvpxLoopFilter) {
        this.disableLibvpxLoopFilter = disableLibvpxLoopFilter;
      }

      public String getServerProvidedBandwidthHeader() {
        return this.serverProvidedBandwidthHeader;
      }

      public void setServerProvidedBandwidthHeader(String serverProvidedBandwidthHeader) {
        this.serverProvidedBandwidthHeader = serverProvidedBandwidthHeader;
      }

      public Boolean getEnableOpus() {
        return this.enableOpus;
      }

      public void setEnableOpus(Boolean enableOpus) {
        this.enableOpus = enableOpus;
      }

      public String getNumVideoSegmentsPerFetchStrategy() {
        return this.numVideoSegmentsPerFetchStrategy;
      }

      public void setNumVideoSegmentsPerFetchStrategy(String numVideoSegmentsPerFetchStrategy) {
        this.numVideoSegmentsPerFetchStrategy = numVideoSegmentsPerFetchStrategy;
      }

      public Integer getSlidingWindowSize() {
        return this.slidingWindowSize;
      }

      public void setSlidingWindowSize(Integer slidingWindowSize) {
        this.slidingWindowSize = slidingWindowSize;
      }

      public Boolean getPreventVideoFrameLaggingWithLibvpx() {
        return this.preventVideoFrameLaggingWithLibvpx;
      }

      public void setPreventVideoFrameLaggingWithLibvpx(Boolean preventVideoFrameLaggingWithLibvpx) {
        this.preventVideoFrameLaggingWithLibvpx = preventVideoFrameLaggingWithLibvpx;
      }

      public Boolean getRecordTrackRendererTimingEvents() {
        return this.recordTrackRendererTimingEvents;
      }

      public void setRecordTrackRendererTimingEvents(Boolean recordTrackRendererTimingEvents) {
        this.recordTrackRendererTimingEvents = recordTrackRendererTimingEvents;
      }

      public Boolean getEnableV2Gapless() {
        return this.enableV2Gapless;
      }

      public void setEnableV2Gapless(Boolean enableV2Gapless) {
        this.enableV2Gapless = enableV2Gapless;
      }

      public Integer getDrmMaxKeyfetchDelayMs() {
        return this.drmMaxKeyfetchDelayMs;
      }

      public void setDrmMaxKeyfetchDelayMs(Integer drmMaxKeyfetchDelayMs) {
        this.drmMaxKeyfetchDelayMs = drmMaxKeyfetchDelayMs;
      }

      public Integer getMinAdaptiveVideoQuality() {
        return this.minAdaptiveVideoQuality;
      }

      public void setMinAdaptiveVideoQuality(Integer minAdaptiveVideoQuality) {
        this.minAdaptiveVideoQuality = minAdaptiveVideoQuality;
      }

      public Integer getNumVideoSegmentsPerFetch() {
        return this.numVideoSegmentsPerFetch;
      }

      public void setNumVideoSegmentsPerFetch(Integer numVideoSegmentsPerFetch) {
        this.numVideoSegmentsPerFetch = numVideoSegmentsPerFetch;
      }

      public Boolean getUseOpusMedAsLowQualityAudio() {
        return this.useOpusMedAsLowQualityAudio;
      }

      public void setUseOpusMedAsLowQualityAudio(Boolean useOpusMedAsLowQualityAudio) {
        this.useOpusMedAsLowQualityAudio = useOpusMedAsLowQualityAudio;
      }

      public String getManifestlessPartialChunkStrategy() {
        return this.manifestlessPartialChunkStrategy;
      }

      public void setManifestlessPartialChunkStrategy(String manifestlessPartialChunkStrategy) {
        this.manifestlessPartialChunkStrategy = manifestlessPartialChunkStrategy;
      }

      public Boolean getEnableBandaidHttpDataSource() {
        return this.enableBandaidHttpDataSource;
      }

      public void setEnableBandaidHttpDataSource(Boolean enableBandaidHttpDataSource) {
        this.enableBandaidHttpDataSource = enableBandaidHttpDataSource;
      }

      public Integer getLiveOnlyReadaheadStepSizeChunks() {
        return this.liveOnlyReadaheadStepSizeChunks;
      }

      public void setLiveOnlyReadaheadStepSizeChunks(Integer liveOnlyReadaheadStepSizeChunks) {
        this.liveOnlyReadaheadStepSizeChunks = liveOnlyReadaheadStepSizeChunks;
      }

      public Integer getMinDurationToRetainAfterDiscardMs() {
        return this.minDurationToRetainAfterDiscardMs;
      }

      public void setMinDurationToRetainAfterDiscardMs(Integer minDurationToRetainAfterDiscardMs) {
        this.minDurationToRetainAfterDiscardMs = minDurationToRetainAfterDiscardMs;
      }

      public Integer getHdrMinScreenBrightness() {
        return this.hdrMinScreenBrightness;
      }

      public void setHdrMinScreenBrightness(Integer hdrMinScreenBrightness) {
        this.hdrMinScreenBrightness = hdrMinScreenBrightness;
      }

      public Integer getAudioBufferSegmentCount() {
        return this.audioBufferSegmentCount;
      }

      public void setAudioBufferSegmentCount(Integer audioBufferSegmentCount) {
        this.audioBufferSegmentCount = audioBufferSegmentCount;
      }

      public Boolean getPreferOnesieBufferedFormat() {
        return this.preferOnesieBufferedFormat;
      }

      public void setPreferOnesieBufferedFormat(Boolean preferOnesieBufferedFormat) {
        this.preferOnesieBufferedFormat = preferOnesieBufferedFormat;
      }

      public Boolean getEnableVp9IfInHardware() {
        return this.enableVp9IfInHardware;
      }

      public void setEnableVp9IfInHardware(Boolean enableVp9IfInHardware) {
        this.enableVp9IfInHardware = enableVp9IfInHardware;
      }

      public Boolean getUseDynamicReadAhead() {
        return this.useDynamicReadAhead;
      }

      public void setUseDynamicReadAhead(Boolean useDynamicReadAhead) {
        this.useDynamicReadAhead = useDynamicReadAhead;
      }

      public String getOnesieVideoBufferLoadTimeoutMs() {
        return this.onesieVideoBufferLoadTimeoutMs;
      }

      public void setOnesieVideoBufferLoadTimeoutMs(String onesieVideoBufferLoadTimeoutMs) {
        this.onesieVideoBufferLoadTimeoutMs = onesieVideoBufferLoadTimeoutMs;
      }

      public Double getDrmMetricsQoeLoggingFraction() {
        return this.drmMetricsQoeLoggingFraction;
      }

      public void setDrmMetricsQoeLoggingFraction(Double drmMetricsQoeLoggingFraction) {
        this.drmMetricsQoeLoggingFraction = drmMetricsQoeLoggingFraction;
      }

      public Double getHighPoolLoad() {
        return this.highPoolLoad;
      }

      public void setHighPoolLoad(Double highPoolLoad) {
        this.highPoolLoad = highPoolLoad;
      }

      public Boolean getEstimatedServerClockStrictOffset() {
        return this.estimatedServerClockStrictOffset;
      }

      public void setEstimatedServerClockStrictOffset(Boolean estimatedServerClockStrictOffset) {
        this.estimatedServerClockStrictOffset = estimatedServerClockStrictOffset;
      }

      public Boolean getUseLiveDvrForDashLiveStreams() {
        return this.useLiveDvrForDashLiveStreams;
      }

      public void setUseLiveDvrForDashLiveStreams(Boolean useLiveDvrForDashLiveStreams) {
        this.useLiveDvrForDashLiveStreams = useLiveDvrForDashLiveStreams;
      }

      public Integer getWhiteNoiseOffset() {
        return this.whiteNoiseOffset;
      }

      public void setWhiteNoiseOffset(Integer whiteNoiseOffset) {
        this.whiteNoiseOffset = whiteNoiseOffset;
      }

      public Boolean getLibvpxEnableGl() {
        return this.libvpxEnableGl;
      }

      public void setLibvpxEnableGl(Boolean libvpxEnableGl) {
        this.libvpxEnableGl = libvpxEnableGl;
      }

      public Boolean getCronetResetTimeoutOnRedirects() {
        return this.cronetResetTimeoutOnRedirects;
      }

      public void setCronetResetTimeoutOnRedirects(Boolean cronetResetTimeoutOnRedirects) {
        this.cronetResetTimeoutOnRedirects = cronetResetTimeoutOnRedirects;
      }

      public Integer getPlatypusBackBufferDurationMs() {
        return this.platypusBackBufferDurationMs;
      }

      public void setPlatypusBackBufferDurationMs(Integer platypusBackBufferDurationMs) {
        this.platypusBackBufferDurationMs = platypusBackBufferDurationMs;
      }

      public Boolean getEnableExoplayerReuse() {
        return this.enableExoplayerReuse;
      }

      public void setEnableExoplayerReuse(Boolean enableExoplayerReuse) {
        this.enableExoplayerReuse = enableExoplayerReuse;
      }

      public Boolean getUseMediaTimeCappedLoadControl() {
        return this.useMediaTimeCappedLoadControl;
      }

      public void setUseMediaTimeCappedLoadControl(Boolean useMediaTimeCappedLoadControl) {
        this.useMediaTimeCappedLoadControl = useMediaTimeCappedLoadControl;
      }

      public Boolean getUseLiveHeadTimeMillis() {
        return this.useLiveHeadTimeMillis;
      }

      public void setUseLiveHeadTimeMillis(Boolean useLiveHeadTimeMillis) {
        this.useLiveHeadTimeMillis = useLiveHeadTimeMillis;
      }

      public Boolean getUseYtVodMediaSourceForV2() {
        return this.useYtVodMediaSourceForV2;
      }

      public void setUseYtVodMediaSourceForV2(Boolean useYtVodMediaSourceForV2) {
        this.useYtVodMediaSourceForV2 = useYtVodMediaSourceForV2;
      }

      public Boolean getEnableSurfaceviewResizeWorkaround() {
        return this.enableSurfaceviewResizeWorkaround;
      }

      public void setEnableSurfaceviewResizeWorkaround(Boolean enableSurfaceviewResizeWorkaround) {
        this.enableSurfaceviewResizeWorkaround = enableSurfaceviewResizeWorkaround;
      }

      public Boolean getAllowTrackSelectionWithUpdatedVideoItagsForExoV2() {
        return this.allowTrackSelectionWithUpdatedVideoItagsForExoV2;
      }

      public void setAllowTrackSelectionWithUpdatedVideoItagsForExoV2(Boolean allowTrackSelectionWithUpdatedVideoItagsForExoV2) {
        this.allowTrackSelectionWithUpdatedVideoItagsForExoV2 = allowTrackSelectionWithUpdatedVideoItagsForExoV2;
      }

      public String getLiveOnlyPegStrategy() {
        return this.liveOnlyPegStrategy;
      }

      public void setLiveOnlyPegStrategy(String liveOnlyPegStrategy) {
        this.liveOnlyPegStrategy = liveOnlyPegStrategy;
      }

      public Boolean getMatchQualityToViewportOnUnfullscreen() {
        return this.matchQualityToViewportOnUnfullscreen;
      }

      public void setMatchQualityToViewportOnUnfullscreen(Boolean matchQualityToViewportOnUnfullscreen) {
        this.matchQualityToViewportOnUnfullscreen = matchQualityToViewportOnUnfullscreen;
      }

      public Boolean getEnableMaxReadaheadAbrThreshold() {
        return this.enableMaxReadaheadAbrThreshold;
      }

      public void setEnableMaxReadaheadAbrThreshold(Boolean enableMaxReadaheadAbrThreshold) {
        this.enableMaxReadaheadAbrThreshold = enableMaxReadaheadAbrThreshold;
      }
    }

    public static class AudioConfig implements Serializable {
      private Double perceptualLoudnessDb;

      private Double loudnessDb;

      private Boolean enablePerFormatLoudness;

      public Double getPerceptualLoudnessDb() {
        return this.perceptualLoudnessDb;
      }

      public void setPerceptualLoudnessDb(Double perceptualLoudnessDb) {
        this.perceptualLoudnessDb = perceptualLoudnessDb;
      }

      public Double getLoudnessDb() {
        return this.loudnessDb;
      }

      public void setLoudnessDb(Double loudnessDb) {
        this.loudnessDb = loudnessDb;
      }

      public Boolean getEnablePerFormatLoudness() {
        return this.enablePerFormatLoudness;
      }

      public void setEnablePerFormatLoudness(Boolean enablePerFormatLoudness) {
        this.enablePerFormatLoudness = enablePerFormatLoudness;
      }
    }
  }

  public static class VideoDetails implements Serializable {
    private Boolean isOwnerViewing;

    private Thumbnail thumbnail;

    private Boolean isLiveContent;

    private List<String> keywords;

    private String author;

    private String lengthSeconds;

    private String videoId;

    private String shortDescription;

    private Boolean isPrivate;

    private String title;

    private Boolean isCrawlable;

    private Boolean isUnpluggedCorpus;

    private Boolean allowRatings;

    private String viewCount;

    private String channelId;

    public Boolean getIsOwnerViewing() {
      return this.isOwnerViewing;
    }

    public void setIsOwnerViewing(Boolean isOwnerViewing) {
      this.isOwnerViewing = isOwnerViewing;
    }

    public Thumbnail getThumbnail() {
      return this.thumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail) {
      this.thumbnail = thumbnail;
    }

    public Boolean getIsLiveContent() {
      return this.isLiveContent;
    }

    public void setIsLiveContent(Boolean isLiveContent) {
      this.isLiveContent = isLiveContent;
    }

    public List<String> getKeywords() {
      return this.keywords;
    }

    public void setKeywords(List<String> keywords) {
      this.keywords = keywords;
    }

    public String getAuthor() {
      return this.author;
    }

    public void setAuthor(String author) {
      this.author = author;
    }

    public String getLengthSeconds() {
      return this.lengthSeconds;
    }

    public void setLengthSeconds(String lengthSeconds) {
      this.lengthSeconds = lengthSeconds;
    }

    public String getVideoId() {
      return this.videoId;
    }

    public void setVideoId(String videoId) {
      this.videoId = videoId;
    }

    public String getShortDescription() {
      return this.shortDescription;
    }

    public void setShortDescription(String shortDescription) {
      this.shortDescription = shortDescription;
    }

    public Boolean getIsPrivate() {
      return this.isPrivate;
    }

    public void setIsPrivate(Boolean isPrivate) {
      this.isPrivate = isPrivate;
    }

    public String getTitle() {
      return this.title;
    }

    public void setTitle(String title) {
      this.title = title;
    }

    public Boolean getIsCrawlable() {
      return this.isCrawlable;
    }

    public void setIsCrawlable(Boolean isCrawlable) {
      this.isCrawlable = isCrawlable;
    }

    public Boolean getIsUnpluggedCorpus() {
      return this.isUnpluggedCorpus;
    }

    public void setIsUnpluggedCorpus(Boolean isUnpluggedCorpus) {
      this.isUnpluggedCorpus = isUnpluggedCorpus;
    }

    public Boolean getAllowRatings() {
      return this.allowRatings;
    }

    public void setAllowRatings(Boolean allowRatings) {
      this.allowRatings = allowRatings;
    }

    public String getViewCount() {
      return this.viewCount;
    }

    public void setViewCount(String viewCount) {
      this.viewCount = viewCount;
    }

    public String getChannelId() {
      return this.channelId;
    }

    public void setChannelId(String channelId) {
      this.channelId = channelId;
    }

    public static class Thumbnail implements Serializable {
      private List<Thumbnails> thumbnails;

      public List<Thumbnails> getThumbnails() {
        return this.thumbnails;
      }

      public void setThumbnails(List<Thumbnails> thumbnails) {
        this.thumbnails = thumbnails;
      }

      public static class Thumbnails implements Serializable {
        private Integer width;

        private String url;

        private Integer height;

        public Integer getWidth() {
          return this.width;
        }

        public void setWidth(Integer width) {
          this.width = width;
        }

        public String getUrl() {
          return this.url;
        }

        public void setUrl(String url) {
          this.url = url;
        }

        public Integer getHeight() {
          return this.height;
        }

        public void setHeight(Integer height) {
          this.height = height;
        }
      }
    }
  }

  public static class StreamingData implements Serializable {
    private List<Formats> formats;

    private List<AdaptiveFormats> adaptiveFormats;

    private String expiresInSeconds;

    public List<Formats> getFormats() {
      return this.formats;
    }

    public void setFormats(List<Formats> formats) {
      this.formats = formats;
    }

    public List<AdaptiveFormats> getAdaptiveFormats() {
      return this.adaptiveFormats;
    }

    public void setAdaptiveFormats(List<AdaptiveFormats> adaptiveFormats) {
      this.adaptiveFormats = adaptiveFormats;
    }

    public String getExpiresInSeconds() {
      return this.expiresInSeconds;
    }

    public void setExpiresInSeconds(String expiresInSeconds) {
      this.expiresInSeconds = expiresInSeconds;
    }

    public static class Formats implements Serializable {
      private Integer itag;

      private Integer fps;

      private String projectionType;

      private Integer bitrate;

      private String mimeType;

      private String audioQuality;

      private String approxDurationMs;

      private String url;

      private String audioSampleRate;

      private String quality;

      private String qualityLabel;

      private Integer audioChannels;

      private Integer width;

      private String contentLength;

      private String lastModified;

      private Integer height;

      private Integer averageBitrate;

      public Integer getItag() {
        return this.itag;
      }

      public void setItag(Integer itag) {
        this.itag = itag;
      }

      public Integer getFps() {
        return this.fps;
      }

      public void setFps(Integer fps) {
        this.fps = fps;
      }

      public String getProjectionType() {
        return this.projectionType;
      }

      public void setProjectionType(String projectionType) {
        this.projectionType = projectionType;
      }

      public Integer getBitrate() {
        return this.bitrate;
      }

      public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
      }

      public String getMimeType() {
        return this.mimeType;
      }

      public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
      }

      public String getAudioQuality() {
        return this.audioQuality;
      }

      public void setAudioQuality(String audioQuality) {
        this.audioQuality = audioQuality;
      }

      public String getApproxDurationMs() {
        return this.approxDurationMs;
      }

      public void setApproxDurationMs(String approxDurationMs) {
        this.approxDurationMs = approxDurationMs;
      }

      public String getUrl() {
        return this.url;
      }

      public void setUrl(String url) {
        this.url = url;
      }

      public String getAudioSampleRate() {
        return this.audioSampleRate;
      }

      public void setAudioSampleRate(String audioSampleRate) {
        this.audioSampleRate = audioSampleRate;
      }

      public String getQuality() {
        return this.quality;
      }

      public void setQuality(String quality) {
        this.quality = quality;
      }

      public String getQualityLabel() {
        return this.qualityLabel;
      }

      public void setQualityLabel(String qualityLabel) {
        this.qualityLabel = qualityLabel;
      }

      public Integer getAudioChannels() {
        return this.audioChannels;
      }

      public void setAudioChannels(Integer audioChannels) {
        this.audioChannels = audioChannels;
      }

      public Integer getWidth() {
        return this.width;
      }

      public void setWidth(Integer width) {
        this.width = width;
      }

      public String getContentLength() {
        return this.contentLength;
      }

      public void setContentLength(String contentLength) {
        this.contentLength = contentLength;
      }

      public String getLastModified() {
        return this.lastModified;
      }

      public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
      }

      public Integer getHeight() {
        return this.height;
      }

      public void setHeight(Integer height) {
        this.height = height;
      }

      public Integer getAverageBitrate() {
        return this.averageBitrate;
      }

      public void setAverageBitrate(Integer averageBitrate) {
        this.averageBitrate = averageBitrate;
      }
    }

    public static class AdaptiveFormats implements Serializable {
      private Integer itag;

      private IndexRange indexRange;

      private Integer fps;

      private String projectionType;

      private IndexRange initRange;

      private Integer bitrate;

      private String mimeType;

      private String approxDurationMs;

      private String url;

      private String quality;

      private String qualityLabel;

      private Integer width;

      private String contentLength;

      private String lastModified;

      private ColorInfo colorInfo;

      private Integer height;

      private Integer averageBitrate;
      private String audioQuality;

      public String getAudioQuality() {
        return audioQuality;
      }

      public void setAudioQuality(String audioQuality) {
        this.audioQuality = audioQuality;
      }

      public Integer getItag() {
        return this.itag;
      }

      public void setItag(Integer itag) {
        this.itag = itag;
      }

      public IndexRange getIndexRange() {
        return this.indexRange;
      }

      public void setIndexRange(IndexRange indexRange) {
        this.indexRange = indexRange;
      }

      public Integer getFps() {
        return this.fps;
      }

      public void setFps(Integer fps) {
        this.fps = fps;
      }

      public String getProjectionType() {
        return this.projectionType;
      }

      public void setProjectionType(String projectionType) {
        this.projectionType = projectionType;
      }

      public IndexRange getInitRange() {
        return this.initRange;
      }

      public void setInitRange(IndexRange initRange) {
        this.initRange = initRange;
      }

      public Integer getBitrate() {
        return this.bitrate;
      }

      public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
      }

      public String getMimeType() {
        return this.mimeType;
      }

      public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
      }

      public String getApproxDurationMs() {
        return this.approxDurationMs;
      }

      public void setApproxDurationMs(String approxDurationMs) {
        this.approxDurationMs = approxDurationMs;
      }

      public String getUrl() {
        return this.url;
      }

      public void setUrl(String url) {
        this.url = url;
      }

      public String getQuality() {
        return this.quality;
      }

      public void setQuality(String quality) {
        this.quality = quality;
      }

      public String getQualityLabel() {
        return this.qualityLabel;
      }

      public void setQualityLabel(String qualityLabel) {
        this.qualityLabel = qualityLabel;
      }

      public Integer getWidth() {
        return this.width;
      }

      public void setWidth(Integer width) {
        this.width = width;
      }

      public String getContentLength() {
        return this.contentLength;
      }

      public void setContentLength(String contentLength) {
        this.contentLength = contentLength;
      }

      public String getLastModified() {
        return this.lastModified;
      }

      public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
      }

      public ColorInfo getColorInfo() {
        return this.colorInfo;
      }

      public void setColorInfo(ColorInfo colorInfo) {
        this.colorInfo = colorInfo;
      }

      public Integer getHeight() {
        return this.height;
      }

      public void setHeight(Integer height) {
        this.height = height;
      }

      public Integer getAverageBitrate() {
        return this.averageBitrate;
      }

      public void setAverageBitrate(Integer averageBitrate) {
        this.averageBitrate = averageBitrate;
      }

      public static class IndexRange implements Serializable {
        private String start;

        private String end;

        public String getStart() {
          return this.start;
        }

        public void setStart(String start) {
          this.start = start;
        }

        public String getEnd() {
          return this.end;
        }

        public void setEnd(String end) {
          this.end = end;
        }
      }

      public static class ColorInfo implements Serializable {
        private String primaries;

        private String matrixCoefficients;

        private String transferCharacteristics;

        public String getPrimaries() {
          return this.primaries;
        }

        public void setPrimaries(String primaries) {
          this.primaries = primaries;
        }

        public String getMatrixCoefficients() {
          return this.matrixCoefficients;
        }

        public void setMatrixCoefficients(String matrixCoefficients) {
          this.matrixCoefficients = matrixCoefficients;
        }

        public String getTransferCharacteristics() {
          return this.transferCharacteristics;
        }

        public void setTransferCharacteristics(String transferCharacteristics) {
          this.transferCharacteristics = transferCharacteristics;
        }
      }
    }
  }

  public static class ResponseContext implements Serializable {
    private Integer maxAgeSeconds;

    private String visitorData;

    public Integer getMaxAgeSeconds() {
      return this.maxAgeSeconds;
    }

    public void setMaxAgeSeconds(Integer maxAgeSeconds) {
      this.maxAgeSeconds = maxAgeSeconds;
    }

    public String getVisitorData() {
      return this.visitorData;
    }

    public void setVisitorData(String visitorData) {
      this.visitorData = visitorData;
    }
  }

  public static class PlayabilityStatus implements Serializable {
    private Boolean playableInEmbed;

    private String status;

    public Boolean getPlayableInEmbed() {
      return this.playableInEmbed;
    }

    public void setPlayableInEmbed(Boolean playableInEmbed) {
      this.playableInEmbed = playableInEmbed;
    }

    public String getStatus() {
      return this.status;
    }

    public void setStatus(String status) {
      this.status = status;
    }
  }

  public static class PlaybackTracking implements Serializable {
    private VideostatsWatchtimeUrl videostatsWatchtimeUrl;

    private VideostatsWatchtimeUrl videostatsDelayplayUrl;

    private VideostatsWatchtimeUrl qoeUrl;

    private YoutubeRemarketingUrl youtubeRemarketingUrl;

    private VideostatsWatchtimeUrl videostatsPlaybackUrl;

    private VideostatsWatchtimeUrl ptrackingUrl;

    public VideostatsWatchtimeUrl getVideostatsWatchtimeUrl() {
      return this.videostatsWatchtimeUrl;
    }

    public void setVideostatsWatchtimeUrl(VideostatsWatchtimeUrl videostatsWatchtimeUrl) {
      this.videostatsWatchtimeUrl = videostatsWatchtimeUrl;
    }

    public VideostatsWatchtimeUrl getVideostatsDelayplayUrl() {
      return this.videostatsDelayplayUrl;
    }

    public void setVideostatsDelayplayUrl(VideostatsWatchtimeUrl videostatsDelayplayUrl) {
      this.videostatsDelayplayUrl = videostatsDelayplayUrl;
    }

    public VideostatsWatchtimeUrl getQoeUrl() {
      return this.qoeUrl;
    }

    public void setQoeUrl(VideostatsWatchtimeUrl qoeUrl) {
      this.qoeUrl = qoeUrl;
    }

    public YoutubeRemarketingUrl getYoutubeRemarketingUrl() {
      return this.youtubeRemarketingUrl;
    }

    public void setYoutubeRemarketingUrl(YoutubeRemarketingUrl youtubeRemarketingUrl) {
      this.youtubeRemarketingUrl = youtubeRemarketingUrl;
    }

    public VideostatsWatchtimeUrl getVideostatsPlaybackUrl() {
      return this.videostatsPlaybackUrl;
    }

    public void setVideostatsPlaybackUrl(VideostatsWatchtimeUrl videostatsPlaybackUrl) {
      this.videostatsPlaybackUrl = videostatsPlaybackUrl;
    }

    public VideostatsWatchtimeUrl getPtrackingUrl() {
      return this.ptrackingUrl;
    }

    public void setPtrackingUrl(VideostatsWatchtimeUrl ptrackingUrl) {
      this.ptrackingUrl = ptrackingUrl;
    }

    public static class VideostatsWatchtimeUrl implements Serializable {
      private List<Headers> headers;

      private String baseUrl;

      public List<Headers> getHeaders() {
        return this.headers;
      }

      public void setHeaders(List<Headers> headers) {
        this.headers = headers;
      }

      public String getBaseUrl() {
        return this.baseUrl;
      }

      public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
      }

      public static class Headers implements Serializable {
        private String headerType;

        public String getHeaderType() {
          return this.headerType;
        }

        public void setHeaderType(String headerType) {
          this.headerType = headerType;
        }
      }
    }

    public static class YoutubeRemarketingUrl implements Serializable {
      private List<VideostatsWatchtimeUrl.Headers> headers;

      private String baseUrl;

      private Integer elapsedMediaTimeSeconds;

      public List<VideostatsWatchtimeUrl.Headers> getHeaders() {
        return this.headers;
      }

      public void setHeaders(List<VideostatsWatchtimeUrl.Headers> headers) {
        this.headers = headers;
      }

      public String getBaseUrl() {
        return this.baseUrl;
      }

      public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
      }

      public Integer getElapsedMediaTimeSeconds() {
        return this.elapsedMediaTimeSeconds;
      }

      public void setElapsedMediaTimeSeconds(Integer elapsedMediaTimeSeconds) {
        this.elapsedMediaTimeSeconds = elapsedMediaTimeSeconds;
      }
    }
  }
}
